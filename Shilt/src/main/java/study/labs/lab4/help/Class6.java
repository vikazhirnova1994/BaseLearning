package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
а результатом возвращается среднее значение для элементов массива(сумма значений элементов, деленная на количество элементов в массиве).
*/

public class Class6 {
    public static int averArr(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i];
        }
        int aver = sum / v.length;
        return aver;
    }
}
