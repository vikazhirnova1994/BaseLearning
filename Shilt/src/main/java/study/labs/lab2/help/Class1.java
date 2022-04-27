package study.labs.lab2.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

public class Class1 {

    private static final int FUGURE = 11;
    private int i, j, z;

    public Class1() {}

    public void print() {
        for (i = 1; i <= FUGURE; i++) {
            System.out.print(" ");
            z = 0;
            for (j = -11; j <= FUGURE; j++) {
                System.out.print("*" + " ");
                z = z + 1;
            }
            System.out.println();
        }
        System.out.println("Количество символов в строке" + " " + z);
    }
}
