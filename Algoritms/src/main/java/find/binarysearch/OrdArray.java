package find.binarysearch;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class OrdArray {
    private long[] arr; // Ссылка на массив
    private int numberOfElm; // number of data items

    public OrdArray(int maxSize) {
        arr = new long[maxSize];
        numberOfElm = 0;
    }
    public int size (){
        return numberOfElm;
    }

    public int find(long searchKey){
        return recFind(searchKey, 0, numberOfElm-1);
    }

    public int recFind(long searchKey, int lowerBound, int upperBound){
        int currentIndex;
        currentIndex = (lowerBound+upperBound) /2;
        if (arr[currentIndex] == searchKey) return currentIndex;
        else if (lowerBound > upperBound) return -1;
        else
            if (arr[currentIndex] < searchKey){
                return recFind(searchKey,currentIndex+1, upperBound );
            }
            else
                return recFind(searchKey,lowerBound, currentIndex-1);
    }

    public void insert(long value){ // Сохранение элемента в массиве
        int j;
        for (j = 0; j < numberOfElm; j++) { // Определение позиции вставки
            if (arr[j] > value) // (линейный поиск)
                break;
        }
        for (int k = numberOfElm; k > j; k--) { // Перемещение последующих элементов
            arr[k] = arr[k - 1]; // Перемещение элементов
        }
        arr[j] = value; // Вставка
        numberOfElm++; // Увеличение размера
    }

    public void display() {
        for (int i = 0; i < numberOfElm; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
