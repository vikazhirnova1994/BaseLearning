package pattern.structural.decorator.beverage.condimentdecorator;

import pattern.structural.decorator.beverage.type.Beverage;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
