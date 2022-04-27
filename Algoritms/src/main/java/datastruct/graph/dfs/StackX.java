package datastruct.graph.dfs;

public class StackX {

    private final int SIZE = 20;
    private int top;
    private int[] st;

    public StackX() {
        st = new int[SIZE];
        top = -1;
    }

    public void push(int j){ //размещение
        st[++top] = j;
    }

    public int pop(){ //извлечение
       return st[top--];
    }

    public int peek(){ //чтение
        return st[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}
