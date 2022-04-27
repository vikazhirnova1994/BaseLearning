package study.labs.lab1;

import java.util.Random;
import java.util.Arrays;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
Напишите программу, в которой создается целочисленный массив, заполняется случайными числами
и после этого значения элементов в массиве сортируются в порядке убывания значений.
*/

public class Class4 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        System.out.println("Рандомный массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }
    }
}

