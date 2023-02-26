package cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;

import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage<Lion> {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 100;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }

    public void setLions(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public String toString() {
        return "LionCage{" +
                "pollution =" + pollution +
                ", lions=" + lions +
                '}';
    }

    @Override
    public int getCagePollution() {
        return pollution;
    }

    public ArrayList<Lion> addAnimal(Lion animal) {
        lions.add((Lion) animal);
        return lions;
    }

    public int deliverFood(int foodWeight, Animal animal) {
        return 0;
    }

    @Override
    public int deliverFood(int foodWeight) {
        int portion = foodWeight / lions.size();
        for (var lion : lions) {
            lion.feed(portion);
        }
        if (pollution + 10 < MAX_POLLUTION) {
            pollution += 10;
        } else System.out.println("Cage is too polluted. You need to clean it");
        return pollution;
    }

    @Override
    public int cleanCage() {
        return pollution = 0;
    }

    @Override
    public Animal getAnimal() {
        if (!lions.isEmpty()) {
            Animal lion = lions.get(0);
            lions.remove(0);
            return lion;
        } else {
            System.out.println("Cage is empty");
        }
        return null;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void lionManeSort() {
        Collections.sort(lions, new LionComparator());
    }
}