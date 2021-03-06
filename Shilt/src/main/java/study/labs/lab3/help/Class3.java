package study.labs.lab3.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу с классом, у которого есть два целочисленных поля.
 В классе должны быть описаны конструкторы, позволяющие создавать объекты без передачи аргументов,
 с передачей одного аргумента и с передачей двух аргументов.
*/

public class Class3 {
    int a;
    int b;

    //конструктор без передачи аргументов
    public Class3() {
        a = 0;
        b = 0;
    }

    //конструктор c передачей одного аргумента
    public Class3(int i) {
        a = b = i;
    }

    //конструктор c передачей двух аргументов
    public Class3(int i, int j) {
        a = i;
        b = j;
    }
}
