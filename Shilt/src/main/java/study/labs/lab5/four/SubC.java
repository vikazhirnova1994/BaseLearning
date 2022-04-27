package study.labs.lab5.four;

/**
 * @project CommonLab
 * @author Victoria Zhirnova
 */

/*
Напишите программу, в которой использована цепочка наследования из трех классов.
В первом классе есть открытое символьное поле.
Во втором классе появляется открытое текстовое поле.
В третьем классе появляется открытое целочисленное поле.
В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
переданных аргументами конструктору, а также конструктор создания копии.
 */


public class SubC extends SubB {
    public int i;

    //конструктор копия
    SubC(SubC object){
        this.i = object.i;
    }

    //конструктор с двумя параметрами
    SubC(char a, String name, int i){
        super(a, name);
        this.i = i;
    }

    //конструктор с одним параметром
    SubC(int i){
        this.i = i;
    }

    //конструктор при отсутсвии параметров
    SubC(){
        this.i = 0;
    }
}
