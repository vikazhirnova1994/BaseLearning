package sort.bubble;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class ArrayBubble {
    private long[] a;
    private int numberOfElem;

    public ArrayBubble(int maxSize) {
        a = new long[maxSize];
        numberOfElem = 0;
    }

    public void insert(long value) {
        a[numberOfElem] = value;
        numberOfElem++;
    }

    public void display() {
        for (int j = 0; j < numberOfElem; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        int in, out;
        for (out = numberOfElem-1; out > 1 ; out--) {
            for (in = 0; in < out ; in++) {
                if (a[in] > a [in+1]) {
                    swap(in, in+1);
                }
            }
        }

    }
    private void swap(int one, int two){
        long temp = a[one]; //значение первой ячейки сохраняется во временной переменной
        a[one] = a[two]; //в первую ячейку сохраняется значение второй
        a[two] = temp;//значение во временной переменной копируется во вторую ячейку
    }
}
