package animalUtils;

import animals.Animal;
import animals.AnimalComparator;

import java.util.List;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimals(List<T> animalList) {
        animalList.sort(new AnimalComparator());
        return animalList;
    }
}