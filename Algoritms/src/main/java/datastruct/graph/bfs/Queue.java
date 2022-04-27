package datastruct.graph.bfs;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Queue {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public Queue() {
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }
    public void insert(int i){
        if (rear == SIZE -1){
            rear = -1;
        }
        queArray[++rear] = i;
    }

    public int remove(){
        int temp = queArray[front++];
        if (front ==SIZE)
            front =0;
        return temp;
    }

    public boolean isEmpty(){
        return front + SIZE -1 == rear;
    }
}
