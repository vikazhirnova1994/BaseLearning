package pattern.structural.decorator.beverage.condimentdecorator;

import pattern.structural.decorator.beverage.type.Beverage;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
