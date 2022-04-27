package datastruct.list;

import datastruct.list.doublyLinked.DoublyLinkedList;
import datastruct.list.linkedList.Link;
import datastruct.list.linkedList.LinkedList;
import datastruct.list.sortedSort.SortedList;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(22, 2.99); // Вставка четырех элементов
        linkedList.insertFirst(44, 4.99);
        linkedList.insertFirst(66, 6.99);
        linkedList.insertFirst(88, 8.99);
        linkedList.displayList();
        System.out.print("Deleted: ");
        while (!linkedList.isEmpty()){
            Link aLink = linkedList.deleteFirst();
            aLink.displayLink();
        }
        System.out.println();
        linkedList.displayList();

        System.out.println();

        SortedList sortedList = new SortedList();
        sortedList.insert(20);
        sortedList.insert(40);
        sortedList.displayList();
        sortedList.insert(10);
        sortedList.insert(30);
        sortedList.insert(50);
        sortedList.displayList();
        sortedList.remove();
        sortedList.displayList();

        System.out.println();

        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22); // Вставка в начале
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // Вставка в конце
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward(); // Вывод в прямом направлении
        theList.displayBackward(); // Вывод в обратном направлении
        theList.deleteFirst(); // Удаление первого элемента
        theList.deleteLast(); // Удаление последнего элемента
        theList.deleteKey(11); // Удаление элемента с ключом 11
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertAfter(22, 77); // Вставка 77 после 22
        theList.insertAfter(33, 88); // Вставка 88 после 33
        theList.displayForward(); // Вывод в прямом направлении
    }
}
