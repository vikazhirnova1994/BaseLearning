package find.array;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class ArrayFind {
    private long[] arr;
    private int numberOfElm;

    public ArrayFind(int size) { //конструктор
        arr = new long[size];
        numberOfElm = 0;
    }

    public void insert(long value) {
        int j;
        // Определение позиции вставки
        for (j = 0; j < numberOfElm; j++) {
            if (arr[j] > value) break;
        }
        // Перемещение последующих элементов
        for (int k = numberOfElm; k > j; k--) {
            arr[k] = arr[k - 1];
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


    public int findBinaryIndex(long searchKey) {
        int lowerBound = 0;
        int upperBound = numberOfElm - 1;
        int currentIndex;
        while (true) {
            currentIndex = (lowerBound + upperBound) >> 1;
            if (arr[currentIndex] == searchKey)
                return currentIndex;
            else if (lowerBound > upperBound) //массив не отсортирован
                return numberOfElm;
            else {
                if (arr[currentIndex] < searchKey) {
                    lowerBound = currentIndex + 1;
                } else
                    upperBound = currentIndex - 1;
            }
        }
    }

    public boolean delete(long value) {
        int j = findBinaryIndex(value);
        if (j == numberOfElm) {
            return false;
        } else {
            for (int k = j; k < numberOfElm; k++) // Перемещение последующих элементов
                arr[k] = arr[k + 1];
            numberOfElm--; // Уменьшение размера
            return true;
        }
    }
}
