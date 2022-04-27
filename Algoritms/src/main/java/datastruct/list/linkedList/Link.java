package datastruct.list.linkedList;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Link {

    public int iData; // индекс
    public double dData; // значение
    public Link next; //следующий элемент в списке

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }
    public void displayLink(){
        System.out.print("{"+iData+", "+dData+"} ");
    }
}
