package pattern.structural.composite.restaurant.iterator;

import java.util.Iterator;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Nullterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
