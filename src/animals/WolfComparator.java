package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    public int compare(Wolf o1, Wolf o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}