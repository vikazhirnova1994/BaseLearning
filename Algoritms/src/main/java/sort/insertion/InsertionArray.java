package sort.insertion;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class InsertionArray {
    private long[] a;
    private int numberOfElem;

    public InsertionArray( int maxSize) {
        a = new long[maxSize];
        numberOfElem = 0;
    }

    public void insert(long value){
        a[numberOfElem] = value;
        numberOfElem ++;
    }

    public void display(){
        for (int j = 0; j <numberOfElem ; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void insertionSort(){
        int in, out;
        for (out = 0; out < numberOfElem; out++) {
            long temp = a[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while (in>0 && a[in-1] >= temp){ // Пока не найден меньший элемент
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }
}
