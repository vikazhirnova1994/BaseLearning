package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу со статическим методом, которым вычисляется
сумма квадратов натуральных чисел 12 + 22 + 32 + ... + n2.
Число п передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии.
*/


public class Class5 {

   public static int getSumWithRec(int value){
        if (value == 1) return 1;
        return value * value + getSumWithRec(value - 1);
    }
    public static int getSumWithFor(int value) {
     //   int n = 3;
        int sum = 0;
        for (int i = 1; i <= value; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
