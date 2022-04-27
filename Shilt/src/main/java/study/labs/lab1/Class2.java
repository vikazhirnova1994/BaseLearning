package study.labs.lab1;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
    23.	Напишите программу, в которой создается символьный массив из 10 элементов.
    Массив заполнить большими (прописными) буквами английского алфавита.
    Буквы берутся подряд, но только согласные.  Отобразите содержимое созданного массива в консольном окне.
 */

public class Class2 {

    public static void main(String[] args) {
        char[] chArr = new char[26];
        char pchArr = 'A';
        int i = (int) pchArr;
        for (int j = i; j < i + 13; j++) {
            if ((char) j != 'A' & (char) j != 'E' & (char) j != 'I')
                System.out.print((char) j + " ");
        }
    }
}
