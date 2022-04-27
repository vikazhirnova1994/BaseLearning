package study.labs.lab5.one;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString ().
 метод toString () переопределяется так,
что он возвращает строку с названием класса и значение текстового поля или текстовых полей.
 */

public class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    public SuperClassTest() {
    }

    //@Override - аннотация для указываемая для того,
    // чтобы показать что далее мы собираемся переопределять метод суперкласса

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1= " + this.getStr1();

        return ClassNameAndFieldValue;
    }

    //геттеры и сеттеры для str1

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
