package pattern.structural.composite.restaurant.component;

import java.util.Iterator;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class MenuComponent {

    public MenuComponent getChild(){throw new UnsupportedOperationException();}

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public String getName(){throw new UnsupportedOperationException();}

    public String getDescription(){throw new UnsupportedOperationException();}

    public double getPrice(){throw new UnsupportedOperationException();}

    public boolean isVegetarian(){throw new UnsupportedOperationException();}

    public void print(){}

    public abstract Iterator createIterator();
}
