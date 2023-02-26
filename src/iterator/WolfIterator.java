package iterator;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;

public class WolfIterator implements Iterator<Wolf> {
    private int cursor;
    private final ArrayList<Wolf> wolfs;

    public WolfIterator(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    public boolean hasNext() {
        return cursor + 1 <= wolfs.size();
    }

    public Wolf next() {
        return wolfs.get(cursor++);
    }
}