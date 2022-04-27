package study.labs.lab6.help;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Recursion {

    private static int step = 0;

    public static void m1(int x) {
        if ( (2*x+1) <20) {
            m1(2*x+1);
        }
        System.out.println("x="+x);
    }
    public static void m2(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m2(2 * x + 1);
        }
    }
    public static void m3(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1) < 20) {
            m3(2 * x + 1);
        }
        step --;
        space();
        System.out.println("" + x + " <-");
    }

    private static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
