package study.labs.lab1;

import java.util.Scanner;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
   Напишите программу, в которой пользователю предлагается ввести название дня недели.
    По введенному названию программа определяет порядковый номер дня в неделе.
    Если пользователь вводит неправильное название дня, программа выводит сообщение о том,что такого дня нет.
    Предложите версию программы на основе вложенных условных операторов и на основе оператора выбора switch.
*/

public class Class8 {

    public static void main(String[] args) {
        System.out.println("Введите название дня недели");
        Scanner i = new Scanner(System.in);
        String number = i.nextLine();
        switch (number) {
            case "Понедельник":
            case "понедельник":
                System.out.println("Порядковый номер 1");
                break;
            case "Вторник":
            case "вторник":
                System.out.println("Порядковый номер 2");
                break;
            case "Среда":
            case "среда":
                System.out.println("Порядковый номер 3");
                break;
            case "Четверг":
            case "четверг":
                System.out.println("Порядковый номер 4");
                break;
            case "Пятница":
            case "пятница":
                System.out.println("Порядковый номер 5");
                break;
            case "Суббота":
            case "суббота":
                System.out.println("Порядковый номер 6");
                break;
            case "Воскресенье":
            case "воскресенье":
                System.out.println("Порядковый номер 7");
                break;
            default:
                System.out.println("такого дня нет");
        }
    }
}
