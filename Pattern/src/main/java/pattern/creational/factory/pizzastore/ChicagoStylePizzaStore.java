package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("Cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("Pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        else if (type.equals("Clam")){
            return new ChicagoStyleClamPizza();
        }
        return null;
    }
}
