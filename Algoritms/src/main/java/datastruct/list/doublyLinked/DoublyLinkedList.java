package datastruct.list.doublyLinked;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class DoublyLinkedList {
    private  Link first;
    private  Link last;

    public DoublyLinkedList() {
       first = null; // Ссылка на первый элемент списка
        last = null; // Ссылка на последний элемент списка
    }

    public boolean isEmpty(){return first == null;}

    public void insertFirst(long k){ // Вставка элемента в начало списка
       Link newLink = new Link(k);
       if (isEmpty())
           last = newLink; // newLink <-- last если пуст последний элемент в списке связывается с newLink новым элемнетом
       else
           first.previous = newLink; // newLink <-- старое значение first если не пуст, первый элемнет в списке через ссылку previous связывается с новым элементом
       newLink.next= first; // newLink --> старое значение first  новый элемент через ссылку first связывается с первым элементом списка
       first = newLink; //first --> newLink первым элементом становиться новый элемент
    }

    public void insertLast(long k){ // элемент в конец списка
        Link newLink = new Link(k);
        if (isEmpty())
            first = newLink; // first --> newLink если пуст, первый элемнет связывается с ноым элемнетом
        else {
            last.next = newLink; // старое значение last --> newLink, если не пуст последний элемент в списке связвается через next с новым
            newLink.previous = last; //если не пуст новый элемнет через previous связывается с last
        }
        last = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        if (first.next ==null) {
            last = null; // null <-- last убрать связь с последним элементом
        }else{
            first.next.previous = null; // null <-- старое значение next убрать свзять через previous элемента   следующего за первым элемнетом с первым элемнетом
        }
        first = first.next; // first --> старое значение next сделать первым элемнетом в списке элемнет следующий за первым элемнетом
        return temp;
    }

    public Link deleteLast(){
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd){
       Link current = first;
       while (current.data!=key) { // Пока не будет найдено совпадение
           current = current.next;
           if (current == null)
               return false; // Ключ не найден
       }
       Link newLink = new Link(dd); // Создание нового элемента
       if (current==last) {  // Для последнего элемента списка
           newLink.next = null; // newLink --> null ссылка на следующий элемент нового элемнета null
           last = newLink; // newLink <-- last последний элемент это новый элемент
       }
       else {
           newLink.next = current.next;  // newLink --> старое значение next
           current.next.previous = newLink; // newLink <-- старое значение next
       }
       newLink.previous = current; // предыдущи  элемент нового элемнета элемент совпадающий по ключу
       current.next = newLink;
       return true;
    }

    public Link  deleteKey(long key){
        Link current = first;
        while (current.data!= key){
            current= current.next;
            if( current == null) return null;
        }
        if (current == first) {
            first = current.next;
        } else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward(){
        System.out.print("List(first-->last): ");
    Link current = first;  // От начала списка
    while (current!=null){ // Перемещение до конца списка
        current.displayLink();
        current = current.next;
    }
        System.out.println();
    }

    public void displayBackward() {
        System.out.print("List(last-->first): ");
        Link current = last; // От конца списка
        while (current != null) { // Перемещение до начала списка
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
