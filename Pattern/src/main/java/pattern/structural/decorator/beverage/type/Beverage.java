package pattern.structural.decorator.beverage.type;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class Beverage {
    String description= "";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
