package cage;

import animals.Animal;
import animals.Wolf;
import iterator.WolfIterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 90;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    public String toString() {
        return "WolfCage{" +
                "wolfs=" + wolfs +
                '}';
    }

    @Override
    public int getCagePollution() {
        return pollution;
    }

    public ArrayList<Wolf> addAnimal(Wolf wolf) {
        ArrayList<Wolf> w = new ArrayList<>();
        if (wolf instanceof Wolf) {
            wolfs.add((Wolf) wolf);
        }
        return wolfs;
    }

    @Override
    public int deliverFood(int foodWeight) {
        int portion = foodWeight / wolfs.size();
        for (var wolf : wolfs) {
            wolf.feed(portion);
        }
        if (pollution + 10 < MAX_POLLUTION) {
            pollution += 10;
        } else System.out.println("Cage is too polluted. You need to clean it");
        return pollution;
    }


    public int cleanCage() {
        return pollution = 0;
    }

    @Override
    public Animal getAnimal() {
        if (!wolfs.isEmpty()) {
            Animal wolf = wolfs.get(0);
            wolfs.remove(0);
            return wolf;
        } else {
            System.out.println("Cage is empty");
        }
        return null;
    }

    public void wolfSort() {
        //Collections.sort(wolfs, new WolfComparator());
        wolfs.sort(Comparator.comparing(Wolf::getAge)
                .thenComparing(Wolf::getWeight));
    }

    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }
}
