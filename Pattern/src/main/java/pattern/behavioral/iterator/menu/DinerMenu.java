package pattern.behavioral.iterator.menu;

import java.util.ArrayList;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class DinerMenu implements Menu{
    ArrayList menuItems = new ArrayList();

    public DinerMenu() {
        addItem("Vegetarian BTL","---",true,2.95);
        addItem("BTL","Bacon with lettuce and tomato",false,3.99);
        addItem("Soup of Day","Soup of Day with a side of potato",false,3.99);
        addItem("HotDog","HotDog with saukraut, reddish, onions, topped with cheese",false,3.05);
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
