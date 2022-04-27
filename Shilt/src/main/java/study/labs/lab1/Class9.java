package study.labs.lab1;

import java.util.Scanner;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
 Используете кодовую таблицу символов.
*/

public class Class9 {

    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования");
        Scanner i = new Scanner(System.in);
        String text = i.nextLine();

        System.out.println("Введите ключ");
        int shift = i.nextInt();

        char [] CharArray = text.toCharArray();
        int [] ArrayInt = new int[CharArray.length];
        char [] CharArrayNew = new char[CharArray.length];

        for (int j=0; j<CharArray.length;j++){
            ArrayInt[j]= CharArray[j]+ shift;
            CharArrayNew[j] = (char) ArrayInt[j];
        }
        text = new String(CharArrayNew);
        System.out.println();
        System.out.println("Текст после преобразования :");
        System.out.println(text);
        System.out.println();
        System.out.println("Выполнить обратное преобразование? (y/n)");

        Scanner i2 = new Scanner(System.in);
        String answer = i2.nextLine();
        switch (answer){
            case "y":
                char [] CharArray1 = text.toCharArray();
                int [] ArrayInt1 = new int[CharArray1.length];
                char [] CharArrayNew1 = new char[CharArray1.length];
                for (int j=0; j<CharArray.length;j++){
                    ArrayInt1[j]= CharArray1[j] - shift;
                    CharArrayNew1[j] = (char) ArrayInt1[j];
                }
                text = new String(CharArrayNew1);
                System.out.println();
                System.out.println("Текст до преобразования :");
                System.out.println(text);
                System.out.println();
                break;
            case "n":
                System.out.println("До свидания!"); break;
            default:
                System.out.println("Введите корректный ответ");
        }
    }
}
