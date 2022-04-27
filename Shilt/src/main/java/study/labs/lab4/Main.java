package study.labs.lab4;

import shilt.study.lab4.help.*;
import study.labs.lab4.help.*;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

public class Main {

    public static void main(String[] args) {
        Class1 one = new Class1();
        one.set("Текст");
        one.set('a', 'b', 'c');

        Class2.printValue();
        Class2.printValue();
        Class2.printValue();

        System.out.println("Максимальное значение: " + Class3.maxArr(1, 2, 3, 5));
        System.out.println("Минимальное значение: " + Class3.minArr(4, 2, 3, 6));
        System.out.println("Среднее значение: " + Class3.averArr(4, 2, 3, 6));

        int factorialRec = Class4.getFactorialWithRec(6);
        System.out.println("Факториал равен: " + factorialRec);
        int factorialWithFor = Class4.getFactorialWithFor(6);
        System.out.println("Факториал равен: " + factorialWithFor);

        int sumWithRec = Class5.getSumWithRec(3);
        System.out.println("Сумма квадратов равна "+ sumWithRec);
        int sumWithFor = Class5.getSumWithFor(3);
        System.out.println("Сумма квадратов равна " + sumWithFor);
      //  System.out.println("Проверка: " + (1*1 + 2*2 + 3*3));

        int average = Class6.averArr(1, 2, 4, 5, 6);
        System.out.println( average);

        char hello[] = {'h', 'e', 'l', 'l' , 'o'};
        Class7.print(hello);
        char[] reverseHello = Class7.charChange(hello);
        Class7.print(reverseHello);

        int array[] = {1, 4, 6,7,8};
        Class8.print(array);
        int[] arrMinMax = Class8.arrMinMax(array);
        Class8.print(arrMinMax);
    }

}