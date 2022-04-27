package pattern.structural.composite.restaurant.component;


import pattern.structural.composite.restaurant.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Menu extends MenuComponent{
    public ArrayList menuComponents = new ArrayList();
    public String name;
    public String description;
    public  Iterator  iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Iterator createIterator() {
        if (iterator ==null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.print(", " + getDescription());
        System.out.println("_____________");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
