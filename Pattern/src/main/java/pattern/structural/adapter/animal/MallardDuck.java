package pattern.structural.adapter.animal;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in short distance");
    }
}
