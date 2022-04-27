package pattern.structural.decorator.beverage.type;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
