package study.labs.lab2.help;

import java.util.Scanner;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Class8 {
    public Class8() {}

    public void printСipher() {
        System.out.println("Введите текст для шифрования");
        Scanner i1 = new Scanner(System.in);
        String encryptString = i1.nextLine();

        System.out.println("Введите ключ");
        Scanner i2 = new Scanner(System.in);
        int key = i2.nextInt();

        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];

        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + key;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        encryptString = new String(ArrayCharNew);
        System.out.println("Текст после преобразования : " + encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String back = i1.nextLine();

        switch (back) {
            case "y":
                char[] ArrayChar1 = encryptString.toCharArray();
                long[] ArrayInt1 = new long[ArrayChar1.length];
                char[] ArrayCharNew1 = new char[ArrayChar1.length];
                for (int i = 0; i < ArrayChar1.length; i++) {
                    ArrayInt1[i] = ArrayChar1[i] - key;
                    ArrayCharNew1[i] = (char) ArrayInt1[i];
                }
                encryptString = new String(ArrayCharNew1);
                System.out.println("Обратное преобразования : " + encryptString);
                break;
            case "n":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ ");
        }
    }
}
