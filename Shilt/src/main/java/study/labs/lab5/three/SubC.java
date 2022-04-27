package study.labs.lab5.three;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
В третьем классе появляется открытое текстовое ноле, метод с тремя аргументами для присваивания значений полям  (перегрузка
метода из суперкласса) и конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.
 */

public class SubC extends SubB {
    public String a;

    //конструктор с тремя параметрами класса SubC3
    public SubC(int i, char j, String a) {
        super(i, j);
        this.a = a;
    }

    //перегружаемый метод
    public void setI(int i, char j, String a) {
        super.setI(i, j);
        this.a = a;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "i = " +this.i + "\n" +
                "j = " +this.j + "\n" +
                "a = " +this.a;
        return ClassNameAndFieldValue;
    }
}
