package pattern.behavioral.iterator.menu;

import java.util.ArrayList;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class CafeMenu implements Menu{
    ArrayList menuItems = new ArrayList();

    public CafeMenu( ) {
        addItem("Veggie Burger", "---",true, 3.99 );
        addItem("Burrito","A large Burritto with a whole beans, salsa, quacomolle",false,4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new ComposeIterator(menuItems);
    }
}
