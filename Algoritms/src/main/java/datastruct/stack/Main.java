package datastruct.stack;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
        if (!theStack.isFull()){
            theStack.push(90);
        }
        else
            System.out.println("Can't insert, stack is full");
    }
}
