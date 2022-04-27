package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым значением.
В классе должен быть описан статический метод, при вызове которого отображается
текущее значение статического поля, после чего значение поля увеличивается на единицу.
*/

public class Class2 {
    private static int i = 0;
    public static void printValue(){
        System.out.println(" i = : " + i);
        increment();
    }
    private static void increment() {
        i =i +1;
    }
}
