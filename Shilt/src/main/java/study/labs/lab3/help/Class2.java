package study.labs.lab3.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, у которого есть два символьных поля и метод.
Он возвращает результат, и у него нет аргументов.
При вызове метод выводит в консольное окно все символы из кодовой таблицы,
которые находятся «между» символами, являющимися значениями полей объекта (из которого вызывается метод).
Например, если полям объекта присвоены значения ‘A’ и ‘D’,
то при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.
*/

public class Class2 {

    private char symbol1 = 'h';
    private char symbol2 = 'p';

    //возвращает результатом код символа
    public void getSymbols() {
        int begin = (int) symbol1;
        int end = (int) symbol2;
        for (int i = begin; i <= end; i++) {
            char Arr = (char) i;
            System.out.print(Arr + " ");

        }
    }
}
