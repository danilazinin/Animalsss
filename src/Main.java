import animalUtils.AnimalUtils;
import animals.Wolf;
import cage.WolfCage;
import iterator.WolfIterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = new ArrayList<>();
        wolfs.add(new Wolf(3, 5, 4));
        wolfs.add(new Wolf(1, 2, 4));
        wolfs.add(new Wolf(2, 3, 4));
        wolfs.add(new Wolf(4, 6, 4));
        wolfs.add(new Wolf(5, 8, 4));

        WolfCage wc = new WolfCage(wolfs);

        System.out.println(wc);
        AnimalUtils.sortAnimals(wolfs);
        System.out.println(wc);

        WolfIterator wi = new WolfIterator(wolfs);
        for (Wolf w : wc) {
            System.out.println(w);
        }
    }
}