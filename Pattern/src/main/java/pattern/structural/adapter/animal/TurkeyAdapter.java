package pattern.structural.adapter.animal;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobbie();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
