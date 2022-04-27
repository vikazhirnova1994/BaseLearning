package study.labs.lab1;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
        8.	Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
        Массив заполняется буквами «через одну», начиная с буквы ' а ':
        то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
        Отобразите массив в консольном окне в прямом и обратном порядке.
        Размер массива задается переменной
*/

public class Class1 {

    public static void main(String[] args) {
        char c = 'а';
        int r = (int) (c);
        char[] arr = new char[10];

        for (int i=0; i<arr.length; i++){
            arr[i] = (char) r;
           System.out.print(arr[i] + " ");
            r=r+2;
        }
    }
}
