package pattern.structural.decorator.beverage;

import pattern.structural.decorator.beverage.type.Beverage;
import pattern.structural.decorator.beverage.type.Espresso;
import pattern.structural.decorator.beverage.condimentdecorator.Milk;
import pattern.structural.decorator.beverage.condimentdecorator.Mocha;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println("Базовый состав: " + beverage1.getDescription());
        System.out.println("Базовая стоимость: " + beverage1.cost());
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println("Измененный состав: "+ beverage1.getDescription());
        System.out.println("Измененная стоимость: " + beverage1.cost());

    }
}
