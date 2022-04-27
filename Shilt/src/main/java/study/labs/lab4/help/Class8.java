package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
*/

public class Class8 {
    public static int[] arrMinMax(int... v) {
        int max = v[0];
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            max = Math.max(max, v[i]);
            min = Math.min(min, v[i]);
        }
        int[] arrMinMax = {max, min};
        return arrMinMax;
    }
    public static void   print (int[] array) {
        for (int value:  array  ) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
