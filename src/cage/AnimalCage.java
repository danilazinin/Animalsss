package cage;

import animals.Animal;

import java.util.ArrayList;

public interface AnimalCage<T> {
    int getCagePollution();

    ArrayList addAnimal(T animal);

    int deliverFood(int foodWeight);

    int cleanCage();

    Animal getAnimal();
}