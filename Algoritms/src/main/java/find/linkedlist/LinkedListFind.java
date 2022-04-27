package find.linkedlist;

import datastruct.list.linkedList.Link;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class LinkedListFind {
    private Link first; //создание ссылки на начало

    public LinkedListFind() {
        first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        //сдвигаем ссылку на один элемент
        first = newLink;
    }
    public Link find (int key){
        Link current = first;
        while (current.iData!=key){
            if(current.next==null) // Если достигнут конец списка
                return null; // и совпадение не найдено
            else // Если еще остались элементы
                // Перейти к следующему элементу
            current = current.next;
        }
        return current;
    }
    public Link delete (int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) { // Поиск элемента
            if (current.next == null)
                return null;
            else
                previous = current; // Перейти к следующему элементу
                current = current.next;
        }
        if (current == first) //Если первый элемент,
            first = first.next; // изменить first
        else
            previous.next = current.next; // В противном случае обойти его в списке
        return current;
    }
    public void displayList() {
        System.out.print("List (fist-->last): ");
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
