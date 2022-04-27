package pattern.structural.composite.restaurant.component;

import pattern.structural.composite.restaurant.iterator.Nullterator;
import java.util.Iterator;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class MenuItem extends MenuComponent {
    public String name;
    public String description;
    public boolean vegetarian;
    public double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public double getPrice(){ return price;}
    public boolean isVegetarian(){ return vegetarian;}
    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
            System.out.print(", " + getPrice());
            System.out.print(", " + getDescription());
        }
    }

    @Override
    public Iterator createIterator() {
        return new Nullterator();
    }
}
