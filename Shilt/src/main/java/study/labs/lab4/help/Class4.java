package study.labs.lab4.help;

/**
 * @author Victoria Zhirnova
 * @project CommonLab
 */

/*
Напишите программу, в которой описан статический метод для вычисления двойного факториала числа,
переданного аргументом методу. По определению, двойной факториал числа п (обозначается как n!!)
— это произведение через одно всех чисел, не больших числа п.
То есть n!! = п * (n - 2) * (п - 4)* ...
(последний множитель равен 1 для нечетного п и равен 2 для четного n).
Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
Предложите версию метода без рекурсии и с рекурсией.
*/

public class Class4 {
   public static int getFactorialWithRec(int value) {
        if (value == 1) return 1;
        return getFactorialWithRec(value - 1) * value;
    }

    public static int getFactorialWithFor(int value) {
        int sum = 1;
        for (int i = 1; i <= value; i++) {
            sum *= i;
        }
        return sum;
    }
}
