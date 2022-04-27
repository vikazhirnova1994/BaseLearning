package study.labs.lab3.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, у которого есть закрытое целочисленное поле.
Значение полю присваивается с помощью открытого метода.
Методу аргументом может передаваться целое число, а также метод может вызываться без аргументов.
Если методы вызывается без аргументов, то поле получает нулевое значение.
Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.
Однако если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу что и метод для присваивания значения полю.
Также в классе должен быть метод, позволяющий проверить значение поля.
 */

public class Class5 {
    private int i;

   //конструктор без аргумента
   public Class5() {
        this.i = 0;
    }

    //констуктор с аргументом
    public Class5(int value) {
        this.i = value;
    }


    public void printRefreshValue(){
        System.out.println("  :" + refreshValue());
    }

    public void printRefreshValue(int newValue){
        System.out.println("  :" + refreshValue(newValue));
    }

    //метод присваивающий аргумент с прверкой
    private int refreshValue() {
        return check(i);
    }
    private int refreshValue(int newValue) {
      this.i = newValue;
      return check(i);
    }

    private int check (int value){
        if (i==0) i = 0;
        else if (i > 100) i= 100;
        return i;
    }
}
