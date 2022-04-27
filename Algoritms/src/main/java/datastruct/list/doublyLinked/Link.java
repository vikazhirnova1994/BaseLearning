package datastruct.list.doublyLinked;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Link {
    public long data;
    public Link next; // Следующий элемент в списке
    public Link previous; // Предыдущий  элемент в списке

    public Link(long data) {
        this.data = data;
    }

    public void displayLink(){
        System.out.print (data + " ");
    }
}
