package datastruct.stack;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class StackX {

    private int maxSize;
    private long[] stackArray;
    private int top; //вершина стека

    public StackX(int s) {
        maxSize = s; //размер стека
        stackArray = new long[maxSize]; // создание массива
        top = -1; // пока нет элементов
    }
    public void push(long j){ //размещение
        stackArray[++top] = j;

    }

    public long pop(){ //извлечение
        return stackArray[top--];
    }

    public  long peek(){ //извлечение вершины стека
        return stackArray[top];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top==-1);
    }
}
