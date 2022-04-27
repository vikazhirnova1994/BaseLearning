package pattern.behavioral.tempMethod.coffee;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class CoffeineBeverage {

    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boil Water");
    }
    public void pourInCup(){
        System.out.println("Pour into Cup");
    }
}
