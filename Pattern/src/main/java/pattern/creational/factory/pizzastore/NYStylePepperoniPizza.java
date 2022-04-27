package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "NY Style Slice and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        topping.add("Grated Reggiano Cheese");
    }
}
