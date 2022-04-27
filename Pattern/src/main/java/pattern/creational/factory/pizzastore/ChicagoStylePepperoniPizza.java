package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";
        topping.add("Shredded Mozarella Cheese");
    }
}
