package pattern.behavioral.iterator.menu;

import java.util.ArrayList;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class PancakeMenu implements Menu{

    ArrayList menuItems = new ArrayList();;

    public PancakeMenu() {
        addItem("K&B Pancake breakfast","Pancake with scramblieed eggs, toast",true,2.99);
        addItem("Blueberry Pancake breakfast","Pancake with blueberry",true,3.49);
        addItem("Regular Pancake breakfast","Pancake with fried eggs, sauasage",false,2.99 );
        addItem("Waffles","Waffles with your choice of blueberry or strawberry",true,3.59 );
    }

    @Override
    public Iterator createIterator() {
        return new ComposeIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
