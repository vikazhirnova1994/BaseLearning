package study.labs.lab5.five;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
Проверьте работу метода, отображающего значения полей объектов, для каждого из объектов.
Вызовите этот же метод через объектную переменную суперкласса, которая ссылается на объект производного класса.
 */

public class Main {
    public static void main(String[] args) {
        SuperA object1 = new SuperA("A");
        SubB object2 = new SubB("B", 1);
        SubC object3 = new SubC("C",'z');
        SuperA var;
        var = object1;
        System.out.println("Объект1 "+ var.toString());
        System.out.println();
        var = object2;
        System.out.println("Объект1 "+ var.toString());
        System.out.println();
        var = object3;
        System.out.println("Объект1 "+ var.toString());
        System.out.println();
    }
}
