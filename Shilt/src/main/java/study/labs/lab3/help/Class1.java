package study.labs.lab3.help;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа.
Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
*/

public class Class1 {
    //поле
    private char symbol;
    //присвоение значения полю
    public void setSymbol() {
        symbol = 'a';
    }
    //возвр результата
    public int getCodeSymbol() {
        int code = (int) symbol;
        return code;
    }
    //вывод
    public void print() {
        System.out.println("Полученный символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }
}
