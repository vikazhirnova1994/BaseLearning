package pattern.structural.decorator.beverage.type;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Espresso extends Beverage{
    
    public Espresso(){
        description = "Espresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
}
