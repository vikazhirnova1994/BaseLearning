package pattern.structural.adapter.animal;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class WildTurkey implements Turkey{
    @Override
    public void gobbie() {
        System.out.println("Gobbie");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in short distance");
    }
}
