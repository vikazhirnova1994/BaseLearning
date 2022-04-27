package datastruct.hashTable.chainHash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {

    public static void main(String[] args) throws IOException{
        int akey;
        Link aDataItem;
        Random r= new Random();
        int size, n, keyPerCell =100;
        System.out.println("Enter size of datastruct.HashTable: "); // initial - исходный
        size = getInt();
        System.out.println("Enter initial number of items: "); // initial - исходный
        n = getInt();
        HashTable hashTable = new HashTable(size);
        for (int i = 0; i < size; i++) {
            akey = (int)  r.nextInt(10)*keyPerCell*size;
            System.out.println(akey);
            aDataItem = new Link(akey);
            hashTable.insert(aDataItem);
        }

        while (true) {
            System.out.println("Enter first letter of ");
            System.out.println("show, insert, find: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    hashTable.displayTable();
                    break;
                case 'i':
                    System.out.println("Enter key value to insert: ");
                    akey = getInt();
                    aDataItem = new Link(akey);
                    hashTable.insert(aDataItem);
                    break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    akey = getInt();
                    aDataItem = hashTable.find(akey);
                    if (aDataItem !=null){
                        System.out.println("Found: " + akey);
                    } else {
                        System.out.println("Could not find: " + akey);
                    }
                    break;
            }
        }
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s= br.readLine();
        return s;
    }
}
