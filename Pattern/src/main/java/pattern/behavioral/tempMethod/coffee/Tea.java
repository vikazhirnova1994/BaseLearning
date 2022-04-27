package pattern.behavioral.tempMethod.coffee;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Tea extends CoffeineBeverage{
    @Override
    void brew() {
        System.out.println("Stepping bag Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
