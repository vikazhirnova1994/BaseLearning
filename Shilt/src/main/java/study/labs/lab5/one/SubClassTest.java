package study.labs.lab5.one;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
На основе суперкласса путем наследования создается подкласс.
У него появляется еще одно приватное текстовое ноле.
Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так,
что он возвращает строку с названием класса и значение текстового поля или текстовых полей.
*/
public class SubClassTest extends SuperClassTest {

    private String str2;
    private String str3;

    //конструктор с одним параметром вызываемый конструтор супер класса
    SubClassTest(String strEx) {

        super(strEx);
    }

    public SubClassTest(String str2, String str3) {
       // super(strEx);
        this.str2 = str2;
        this.str3 = str3;
    }
    //@Override - аннотация для переопределения метода суперкласса
    @Override
    public String toString() {

        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" +"\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1= " +this.getStr1()+"\n" +
        "str2= " +this.str2+"\n" +
        "str3= " +this.str3;

        return ClassNameAndFieldValue;
    }

    //геттеры и сеттеры для str2, str3
    public String getStr2() {
        return str2;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
    public String getStr3() {
        return str3;
    }
    public void setStr3(String str3) {
        this.str3 = str3;
    }
}