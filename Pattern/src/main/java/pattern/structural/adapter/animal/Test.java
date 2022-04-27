package pattern.structural.adapter.animal;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        System.out.print("\nMallardDuck says ");
        mallardDuck.quack();
        WildTurkey wildTurkey = new WildTurkey();
        System.out.print("\nWildTurkey says ");
        wildTurkey.gobbie();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.print("\nWildTurkey says ");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
