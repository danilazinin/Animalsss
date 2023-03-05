package cage;

import animals.Animal;

import java.util.ArrayList;

public interface AnimalCage<T extends Animal> {
    int getCagePollution();

    ArrayList<T> addAnimal(T animal);

    int deliverFood(int foodWeight);

    int cleanCage();

    T getAnimal();
}