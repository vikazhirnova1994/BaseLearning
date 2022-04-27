package study.labs.lab5.five;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
Напишите программу, в которой есть суперкласс с защищенным текстовым полем, конструктор с текстовым
 параметром и метод, при вызове которого в консольном окне отображается название класса и значение поля.
 */

public class SuperA {
    private String name;

    SuperA(String name){
        this.name = name;
    }

    public String toString(){
      String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "super"+ "\n" +
                "Class name: " + getClass().getSimpleName() + "\n"+
                "name = " + this.name;
        return ClassNameAndFieldValue;
    }
}
