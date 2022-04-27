package datastruct.list.sortedSort;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Link {
    public long data;
    public Link next;
    public Link(long d) {
        data = d;
    }
    public void display(){
        System.out.print(data + " ");
    }
}
