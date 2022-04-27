package study.labs.lab2.help;

import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @created 22.04.2022/04/2022 - 11:41
 * @project commonLab
 */

public class Class6 {

    public Class6() {}

    public void printArray() {
        int row = 3;
        int colomn = 4;

        int[][] arr = new int[row][colomn];
        Random random = new Random();
        System.out.println("Полученный массив");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        int delRow = random.nextInt(row);
        int delColomn = random.nextInt(colomn);

        System.out.println("Row to delete: " + delRow);
        System.out.println("Column to delete: " + delColomn);

        System.out.println("Массив после удаления");

        for (int i = 0; i < row; i++) {
            if (i == delRow) i = i + 1;
            for (int j = 0; j < colomn-1; j++) {
                if (j == delColomn) j = j + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
