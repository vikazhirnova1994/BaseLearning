package pattern.creational.factory.pizzastore;

import java.util.ArrayList;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping = new ArrayList();

   public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing  dough ...");
        System.out.println("Adding sauce ..." );
        System.out.println("Adding topping: " );
        for (int i = 0; i < topping.size(); i++) {
            System.out.print(" " + topping.get(i));
        }
    }

    public  void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void  box(){
        System.out.println("Place pizza in official PizzaStoreBox");
    }

    public String getName() {
        return name;
    }
}
