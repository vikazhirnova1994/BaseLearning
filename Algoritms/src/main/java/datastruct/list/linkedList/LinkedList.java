package datastruct.list.linkedList;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class LinkedList {
    private Link first; // Ссылка на первый элемент списка

    public LinkedList() {
        first = null;// Список пока не содержит элементов Конструктор LinkList инициализирует first значением null.
    }

    public boolean isEmpty() {
        return first == null;// true если пуст
    }

    public void insertFirst(int id, double dd){
        Link newLInk = new Link(id, dd);
        newLInk.next = first; //newLink --> старое значение first
        first = newLInk; // first --> newLink
    }

    public Link deleteFirst(){ // (предполагается, что список не пуст) необходимо перед вызовом проверить isEmpty()
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp; // Метод возвращает ссылку на удаленный элемент
    }

    public void displayList(){
        System.out.print("List (fist-->last): ");
        Link current = first;
        while (current!=null){  // Перемещение до конца списка
            current.displayLink();
            current= current.next; // Переход к следующему элементу
        }
        System.out.println();
    }
}
