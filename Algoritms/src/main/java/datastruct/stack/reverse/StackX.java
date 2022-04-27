package datastruct.stack.reverse;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
       maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;

    }
    public char pop(){ //извлечение с вершины стека
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top]; //чтение вершины
    }
    public  boolean isEmpty(){
        return (top==-1);
    }

    public  boolean isFull(){
        return (top==maxSize-1);
    }

}
