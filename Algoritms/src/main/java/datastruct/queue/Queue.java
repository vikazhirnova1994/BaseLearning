package datastruct.queue;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int numberItems;

    public Queue(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        front = 0; // начало первый элемнет
        rear = -1; //конец последний элемент
        numberItems = 0;
    }

    public void insert(long value){ // Вставка элемента в конец очереди
        if(rear==maxSize-1) rear =-1; // Циклический перенос
        queArray[++rear]=value; // Увеличение rear и вставка
        numberItems++; // Увеличение количества элементов
    }

    public long remove(){// Извлечение элемента в начале очереди
        long temp = queArray[front++];// Выборка и увеличение front
        if(front==maxSize) // Циклический перенос
            front=0;
        numberItems--; // Уменьшение количества элементов
        return temp;
    }

    public  long peekFront(){// Чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty(){
        return numberItems==0;
    }

    public boolean isFull(){
        return numberItems==maxSize;
    }

    public int size(){
        return numberItems;
    }
}
