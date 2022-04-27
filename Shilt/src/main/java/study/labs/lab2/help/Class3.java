package study.labs.lab2.help;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Class3 {

    private static final int LENGTH = 5;
    public Class3() {}

    public void print() {
        int[][] arr = new int[LENGTH][LENGTH];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
