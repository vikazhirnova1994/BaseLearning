package datastruct.list.sortedSort;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class SortedList {
    private datastruct.list.sortedSort.Link first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(long key) { // Вставка в порядке сортировки
        datastruct.list.sortedSort.Link newLink = new datastruct.list.sortedSort.Link(key); // Создание нового элемента
        datastruct.list.sortedSort.Link previous = null; // От начала списка
        datastruct.list.sortedSort.Link current = first; // До конца списка
        while (current != null && key > current.data) { // или если key > current,
            previous = current;
            current = current.next; // Перейти к следующему элементу
        }
        if (previous == null) // В начале списка
            first = newLink; // first --> newLink
        else // Не в начале
            previous.next = newLink; // старое значение prev --> newLink
        newLink.next = current; // newLink --> старое значение current
    }

    public datastruct.list.sortedSort.Link remove() {
        datastruct.list.sortedSort.Link temp = first;
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
