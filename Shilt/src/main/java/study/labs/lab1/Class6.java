package study.labs.lab1;

import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
    апишите программу, в которой создается массив п заполняется случайными числами.
    Массив отображается в консольном окне.
    В этом массиве необходимо определить элемент с минимальным значением.
    В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
    Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
*/

public class Class6 {

    public static void main(String[] args) {
        int[] Arr = new int[5];
        Random r = new Random();

        System.out.println("Массив: ");
        System.out.print("Arr[i]: ");

        int min = 0;
        for (int i = 0; i < 5; i++) {
            Arr[i] = r.nextInt(10);
            System.out.print(Arr[i] + " ");
            if (Arr[i] < Arr[min]) min = i;
        }
        System.out.println();
        System.out.println("Минимальное число:");
        System.out.println("Arr[" + min + "]: " + Arr[min]);
    }
}