package sort;

import sort.merge.DArray;
import sort.bubble.ArrayBubble;
import sort.insertion.InsertionArray;
import sort.object.ObjectArray;
import sort.selection.ArraySelect;
import sort.quick.ArrayIns;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {
    public static void main(String[] args) {

        ArrayBubble arrayBubble = new ArrayBubble(100);
        arrayBubble.insert(77); // Вставка 10 элементов
        arrayBubble.insert(44);
        arrayBubble.insert(55);
        arrayBubble.insert(22);
        arrayBubble.display();
        arrayBubble.bubbleSort();
        arrayBubble.display();

        InsertionArray insertionArray = new InsertionArray(100);
        insertionArray.insert(99);
        insertionArray.insert(44);
        insertionArray.insert(55);
        insertionArray.insert(22);
        insertionArray.display();
        insertionArray.insertionSort();
        insertionArray.display();

        ArraySelect arraySelect = new ArraySelect(100);
        arraySelect.insert(77); // Вставка 10 элементов
        arraySelect.insert(99);
        arraySelect.insert(44);
        arraySelect.insert(55);
        arraySelect.insert(22);
        arraySelect.display();
        arraySelect.selectionSort();
        arraySelect.display();

        ObjectArray personArray = new ObjectArray(100);
        personArray.insert("Zhirnova", "Victoria", 37);
        personArray.insert("Popov", "Roman", 24);
        personArray.insert("Stimson", "Stimson", 21);
        System.out.println("Before sorting:");
        personArray.display();
        personArray.insertionSort();
        System.out.println("After sorting:");
        personArray.display();

        ArrayIns arr = new ArrayIns(6);
        for(int j=0; j<6; j++) {
            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();

        DArray dArray = new DArray(100);
        dArray.insert(64);
        dArray.insert(21);
        dArray.insert(33);
        dArray.insert(70);
        dArray.insert(12);
        dArray.insert(0);
        dArray.insert(108);
        dArray.insert(36);
        dArray.display();
        dArray.mergeSort();
        dArray.display();
    }
}
