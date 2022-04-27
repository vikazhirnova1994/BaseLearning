package study.labs.lab3;

import shilt.study.lab3.help.*;
import study.labs.lab3.help.*;

/**
 @project CommonLab
 @author Victoria Zhirnova
*/

public class Main {

    public static void main(String[] args) {
        Class1 first = new Class1();
        first.setSymbol();
        first.getCodeSymbol();
        first.print();

        Class2 second = new Class2();
        second.getSymbols();

        Class3 third1 = new Class3();
        Class3 third2 = new Class3(1);
        Class3 third3 = new Class3(1, 2);

        Class4 fourth1 = new Class4(1, 'b');
        fourth1.printIJ();
        Class4 fourth2 = new Class4(12.65);
        fourth2.printIJ();

        Class5 fifth = new Class5();
        fifth.printRefreshValue();
        fifth.printRefreshValue(25);
        fifth.printRefreshValue(120);

        Class6 sixth1 = new Class6();
        sixth1.setMaxMin(1);
        sixth1.printMax();
        sixth1.printMin();
        Class6 sixth2 = new Class6();
        sixth2.setMaxMin(1, 2);
        sixth2.printMax();
        sixth2.printMin();
    }
}
