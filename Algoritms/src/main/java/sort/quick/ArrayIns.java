package sort.quick;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class ArrayIns {
    private long[] arr;
    private int numberOfElm;

    public ArrayIns(int maxSize) {
        arr = new long[maxSize];
        numberOfElm = 0;
    }

    public void insert(long value) {
        arr[numberOfElm] = value;
        numberOfElm++;
    }
    public void display() {
        for (int i = 0; i < numberOfElm; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void quickSort(){
        recQuickSort(0, numberOfElm-1);
    }
    public void recQuickSort(int left, int right){
        if (right - left <= 0) return;
        else {
            long pivot = arr[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1); // Сортировка левой части
            recQuickSort(partition+1, right); // Сортировка правой части
        }

    }
    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left-1; // Левая граница (после ++)
        int rightPtr = right; // Правая граница-1 (after --)
        while(true) {
            while( arr[++leftPtr] < pivot )// Поиск большего элемента
                ; // (nop)
            while(rightPtr > 0 && arr[--rightPtr] > pivot)// Поиск меньшего элемента
                ; // (nop)
            if(leftPtr >= rightPtr) // Если указатели сошлись,
                break; // разбиение закончено.
            else // В противном случае
                swap(leftPtr, rightPtr); // поменять элементы местами.
        }
        swap(leftPtr, right); // Перестановка опорного элемента
        return leftPtr; // Возврат позиции опорного элемента
    }
    public void swap(int dex1, int dex2){
        long temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }
}
