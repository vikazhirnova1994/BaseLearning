package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами:
первый — с последним, второй — с предпоследним и так далее.
*/

public class Class7 {

    public static char[] charChange(char[] a) {
        char temp[] = new char[a.length];
        int i = 0;
       // System.out.print("Измененный массив: ");

        for (int j = a.length-1; j >=0; j--) {
            temp[i] = a[j];
            i = i+1;
           // System.out.print(temp + " ");

        }
        return temp;
    }
    public static void   print (char[] array) {
        for (char symbol:  array  ) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
