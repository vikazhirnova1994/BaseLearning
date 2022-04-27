package study.labs.lab2.help;

import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Class5 {

    public Class5() {}

    public void printArray() {
        int[][] Arr = new int[2][3];
        Random random = new Random();
        System.out.println("Полученный массив ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Arr[i][j] = random.nextInt(10);
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Массив наоборот ");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
