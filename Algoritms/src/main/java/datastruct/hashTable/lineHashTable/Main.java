package datastruct.hashTable.lineHashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {
    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int akey, size, n, keyPerCell;
        Random r= new Random();
        System.out.println("Enter size of datastruct.HashTable: "); // initial - исходный
        size = getInt();
        System.out.println("Enter initial number of items: "); // initial - исходный
        n = getInt();
        keyPerCell = 10;
        HashTable theHashTable = new HashTable(size);
        for (int i = 0; i < n; i++) {
            akey = (int)  r.nextInt(10)*keyPerCell*size;
            System.out.println(akey);
            aDataItem = new DataItem(akey);
            theHashTable.insert(aDataItem);
        }

        while (true) {
            System.out.println("Enter first letter of ");
            System.out.println("show, insert, find: ");
            int choice = getChar();
            switch(choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.println("Enter key value to insert: ");
                    akey = getInt();
                    aDataItem = new DataItem(akey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    akey = getInt();
                    aDataItem = theHashTable.find(akey);
                    if (aDataItem != null) {
                        System.out.println("Found: " + akey);
                    } else {
                        System.out.println("Could not find: " + akey);
                    }
                default:
                    System.out.print("Invalid entry\n");
            }
        }

    }

    public static String  getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s= br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
