package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name = "NY Style Slice and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        topping.add("Grated Reggiano Cheese");
    }
}
