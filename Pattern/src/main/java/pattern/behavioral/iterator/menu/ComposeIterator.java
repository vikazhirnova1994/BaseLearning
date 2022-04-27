package pattern.behavioral.iterator.menu;

import java.util.ArrayList;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class ComposeIterator implements Iterator{
    ArrayList menuItems;
    int position;

    public ComposeIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        Object nextItem = menuItems.get(position);
        position = position +1 ;
        return nextItem;
    }

    @Override
    public boolean hasNext() {
        if (position >=menuItems.size() || menuItems.get(position) == null)
            return false;
        else
            return true;
    }
}
