package pattern.creational.factory.pizzastore;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {

     PizzaStore nyStylePizzaStore = createPizzaStoreByStyle("NY");
     Pizza pizza = nyStylePizzaStore.orderPizza("Cheese");
     System.out.println("Vika order " + pizza.getName() + "\n");

     PizzaStore chicagoStylePizzaStore = createPizzaStoreByStyle("Chicago");
     pizza = chicagoStylePizzaStore.orderPizza("Clam");
     System.out.println("Roma order " + pizza.getName() + "\n");
    }

    static PizzaStore createPizzaStoreByStyle(String city){
        if (city.equals("Chicago")){
            return new ChicagoStylePizzaStore();
        } else  if  (city.equals("NY")){
            return new NYStylePizzaStore();
        } else {
            throw new RuntimeException(city + " is unknown city");
        }
    }
}
