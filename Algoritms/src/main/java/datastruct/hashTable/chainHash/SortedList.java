package datastruct.hashTable.chainHash;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public void insert(Link theLink) { //вставка в порядке сортировки
        int key = theLink.getKey();
        Link previous = null;
        Link current = first;
        while (current != null && key > current.getKey()) {
            previous = current; // переход к следующему
            current = current.next;// переход к следующему
        }
        if (previous == null) { //если в начале списка
            first = theLink;
        } else { //если в конце списка
            previous.next = theLink;
        }
        theLink.next = current;
    }

    public void delete(int key) {
        Link previous = null;
        Link current = first;
        while (current != null && key > current.getKey()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = first.next;
        } else {
            previous.next = current.next; //удаление текущего элемента
        }
    }

    public Link find(int key) {
        Link current = first;
        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayList() {
        System.out.print("List (first->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

