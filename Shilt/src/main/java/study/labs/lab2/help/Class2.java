package study.labs.lab2.help;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Class2 {
    private static final int FUGURE = 10;
    private int i, j;

    public Class2() {}

    public void print() {
        for (i = 0; i < FUGURE; i++) {
            for (j = i; j < FUGURE; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
