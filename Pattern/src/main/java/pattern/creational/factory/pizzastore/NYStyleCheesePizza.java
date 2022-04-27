package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Slice and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        topping.add("Grated Reggiano Cheese");
    }
}
