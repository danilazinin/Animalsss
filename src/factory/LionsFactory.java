package factory;

import animals.Lion;

import java.util.ArrayList;

public class LionsFactory {
    public static ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> newLions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            newLions.add(new Lion(0, 0, 0, 0));
        }
        return newLions;
    }
}