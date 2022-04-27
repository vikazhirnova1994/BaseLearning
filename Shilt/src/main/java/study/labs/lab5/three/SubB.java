package study.labs.lab5.three;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
Во втором классе появляется открытое символьное поле, метод с двумя параметрами
для присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя параметрами.
 */

public class SubB extends SuperA {

    public char j;

    // конструктор класса
    public SubB(int i, char j) {
        super(i);
        this.j = j;
    }

    //перегрузка метода
    public void setI(int i, char j) {
        super.setI(i);
        this.j = j;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "i = " +this.i + "\n" +
                "j = " +this.j;
        return ClassNameAndFieldValue;
    }
}