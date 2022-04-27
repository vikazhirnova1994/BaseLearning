package pattern.structural.decorator.beverage.type;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Decaf extends Beverage{

    public Decaf() {
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
