package study.labs.lab5.three;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
В первом суперклассе есть открытое целочисленное поле, метод с одним параметром для присваивания значения полю и
 конструктор с одним параметром. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.
 */

public class SuperA {
    public int i;

    public SuperA(int i) {
        this.i = i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "i = " +this.i;
        return ClassNameAndFieldValue;
    }
}
