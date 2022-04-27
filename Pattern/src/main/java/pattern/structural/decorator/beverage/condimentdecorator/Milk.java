package pattern.structural.decorator.beverage.condimentdecorator;

import pattern.structural.decorator.beverage.type.Beverage;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
