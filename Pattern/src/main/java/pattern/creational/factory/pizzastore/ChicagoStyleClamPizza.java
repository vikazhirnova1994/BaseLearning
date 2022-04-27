package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";
        topping.add("Shredded Mozarella Cheese");
    }
}
