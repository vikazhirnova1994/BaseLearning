package sort.selection;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class ArraySelect {
    private long [] a;
    private int numberOfElem;

    public ArraySelect(int maxSize) {
        a = new long[maxSize];
        numberOfElem = 0;
    }

    public void insert(long value){
        a[numberOfElem] = value;
        numberOfElem++;
    }

    public void display(){
        for (int j = 0; j < numberOfElem ; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void selectionSort(){
        int out, in, min;

        for (out = 0; out < numberOfElem - 1; out++) { // Внешний цикл
            min = out; //назначение минимума
            for (in = out+1; in < numberOfElem ; in++) { //Внутренний цикл
                if (a[in] < a[min]){ //Если значение min больше
                    min = in; //найден новый минимум
                }
                swap(out, min); // поменять местами
            }
        }
    }
    private void swap(int one, int two){
        long temp = a[one];//значение первой ячейки сохраняется во временной переменной
        a[one] = a[two]; //в первую ячейку сохраняется значение второй
        a[two] = temp;//значение во временной переменной копируется во вторую ячейку
    }

}
