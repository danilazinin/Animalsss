package cage;

import animals.Animal;
import animals.Snake;

import java.util.ArrayList;

public class SnakeCage implements AnimalCage<Snake> {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 100;
    private ArrayList<Snake> snakes;

    public SnakeCage(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public int getCagePollution() {
        return pollution;
    }

    public ArrayList addAnimal(Snake snake) {
        ArrayList<Snake> w = new ArrayList<>();
        if (snake instanceof Snake) {
            snakes.add((Snake) snake);
        }
        return snakes;
    }

    public int deliverFood(int foodWeight) {
        int portion = foodWeight / snakes.size();
        for (var snake : snakes) {
            snake.feed(portion);
        }
        if (pollution + 10 < MAX_POLLUTION) {
            pollution += 10;
        } else System.out.println("Cage is too polluted. You need to clean it");
        return pollution;
    }

    public int cleanCage() {
        return pollution = 0;
    }

    public Animal getAnimal() {
        if (!snakes.isEmpty()) {
            Animal snake = snakes.get(0);
            snakes.remove(0);
            return snake;
        } else {
            System.out.println("Cage is empty");
        }
        return null;
    }
}