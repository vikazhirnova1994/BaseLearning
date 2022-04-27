package study.labs.lab3.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
Зна вызове мечение поля max не может быть меньше значения поля min.
Значения полям присваиваются с помощью открытого метода.
Метод может вызываться с одним или двумя целочисленными аргументами.
Притода значения полям присваиваются так:
сравниваются текущие значения полей и значения аргументов, переданных методу.
Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и метод для присваивания значений полям.
В классе также должен быть метод, отображающий в консольном окне значения полей объекта.
 */

public class Class6 {

    private int min;
    private int max;

    public Class6() {

    }

    //конструтор для одного значении
   public Class6(int a) {
        min = max = a;
    }

    //конструтор для двух значении
    public Class6(int a, int b) {
        max = a;
        min = b;
    }

    //setMaxMin открытый метод присваивающий значения полям
    //использутеся перегрузка меотда setMaxMin

    public void setMaxMin(int a) {
        min = max = a;
    }

    public void setMaxMin(int a, int b) {
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
    }

    public void printMax(){
        System.out.println("\nmax = " + max);
    }
    public void printMin(){
        System.out.println("\nmin = " + min);
    }

}
