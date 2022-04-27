package datastruct.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {

    public static void main(String[] args) throws IOException {
        int value1, value2;
        Heap theHeap = new Heap(31);
        boolean success;
        theHeap.insert(70);
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(20);
        theHeap.insert(60);
        theHeap.insert(100);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(10);
        theHeap.insert(90);

        while (true){
            System.out.println("Enter first letter of ");
            System.out.println("show, insert, remove, change ");
            int choice = getChar();
            switch (choice){
                case 's':
                    theHeap.displayHeap();
                    break;
                case 'i':
                    System.out.println("Enter value to insert");
                    value1 = getInt();
                    success = theHeap.insert(value1);
                    if (!success){
                        System.out.println("Can not insert: " + value1);
                    }
                    break;
                case 'r':
                    if (!theHeap.isEmpty())
                        theHeap.remove();
                    else
                        System.out.println("Can not remove ");
                    break;
                default:
                    System.out.println("\nInvalid value");
            }
        }
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
