package study.labs.lab5.second;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса):
без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным параметром.
У конструктора подкласса два параметра (целочисленный и текстовый).
*/

public class SubB extends SuperA {
    private int age;

    public SubB(String name, int age) {
        super(name);
        this.age = age;
    }

    //переопределение метода суперкласса
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setName() {
        super.setName();
    }

    //перегруженный метод
    public void setName(String name, int age) {
        super.setName(name);
        this.age = age;
    }
}

