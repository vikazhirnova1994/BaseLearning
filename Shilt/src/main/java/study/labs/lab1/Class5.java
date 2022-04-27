package study.labs.lab1;

import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
    Напишите программу, в которой создается и инициализируется двумерный числовой массив.
    Затем из этого массива удаляется строка и столбец (создается новый массив,
    в котором по сравнению с исходным удалена одна строка и один столбец).
    Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
*/

public class Class5 {

    public static void main(String[] args) {
        int[][] Arr = new int[3][3]; //кол-во строк
        Random r = new Random();
        System.out.println("Начальный вид массива: ");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                Arr[i][j] = i + j;
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();

        }
        int a = r.nextInt(3);
        System.out.println("Удаляемая сторка: " + a);
        int b = r.nextInt(3);
        System.out.println("Удаляемый столбец: " + b);
        System.out.println("После удаления: ");
        for (int i = 0; i < Arr.length; i++) {
            if (i == a) i = i+1;
            for (int j = 0; j < Arr.length; j++) {
                if (j == b) j = j+1;
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
