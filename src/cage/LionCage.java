package cage;

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
                "lions count = " + lions.size() +
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
    public Lion getAnimal() {
        if (!lions.isEmpty()) {
            Lion lion = lions.get(0);
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