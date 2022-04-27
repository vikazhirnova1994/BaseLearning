package pattern.behavioral.tempMethod.coffee;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Coffee extends CoffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee from filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
