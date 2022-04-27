package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("Cheese")){
            return new NYStyleCheesePizza();
        }
        else if (type.equals("Pepperoni")){
            return new NYStylePepperoniPizza();
        }
        else if (type.equals("Clam")){
            return new NYStyleClamPizza();
        }
        return null;
    }
}
