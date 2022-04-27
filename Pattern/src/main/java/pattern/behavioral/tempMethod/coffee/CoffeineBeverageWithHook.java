package pattern.behavioral.tempMethod.coffee;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class CoffeineBeverageWithHook {
    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boil Water");
    }
    public void pourInCup(){
        System.out.println("Pour into Cup");
    }
    public boolean customerWantCondiments(){ return true;}  //метод перехватчик, почти пустой с реадизацией по умолчанию, может переопределить субкласс
}
