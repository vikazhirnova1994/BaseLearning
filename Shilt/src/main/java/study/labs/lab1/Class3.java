package study.labs.lab1;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

/*
Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
Количество чисел в последовательности вводится пользователем.
Предложите версии программы, использующие разные операторы цикла.
 */

public class Class3 {

    public static void main(String[] args) {
        System.out.println("Последовательность Фиббоначи");
        int a =1;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int sum =0;
        int[] Arr = new int[10];
        int size = 0;
        while (size < Arr.length){
            Arr[size]= sum;
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            size++;
        }
    }
}
