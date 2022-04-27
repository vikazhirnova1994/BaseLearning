package pattern.structural.decorator.beverage.type;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
