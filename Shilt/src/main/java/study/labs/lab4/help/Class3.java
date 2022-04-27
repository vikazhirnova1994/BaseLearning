package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, в котором есть статические методы,
которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив).
Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.
*/

public class Class3 {

    public static int maxArr(int... v) {
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            max = Math.max(max, v[i]);
        }
        return max;
    }

    public static int minArr(int... v) {
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            min = Math.min(min, v[i]);
        }
        return min;
    }

    public static int averArr(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i];
        }
        int aver = sum / v.length;
        return aver;
    }
}
