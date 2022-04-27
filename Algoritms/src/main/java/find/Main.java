package find;

import datastruct.list.linkedList.Link;
import find.array.ArrayFind;
import find.binarysearch.OrdArray;
import find.linkedlist.LinkedListFind;
import find.object.DataArrayPerson;
import find.object.Person;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {

    public static void main(String[] args) {
        ArrayFind array = new ArrayFind(100);
        array.insert(77); // Вставка 10 элементов
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        int binaryIndex = array.findBinaryIndex(88);
        System.out.println(binaryIndex);

        LinkedListFind theList = new LinkedListFind();
        theList.insertFirst(22, 2.99); // Вставка четырех элементов
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        theList.displayList();
        Link f= theList.find(44);
        if (f!=null)
            System.out.println("Found link with key:" + f.iData);
        else
            System.out.println("Can’t find link");

        int maxSize = 100;
        DataArrayPerson arrayPerson = new DataArrayPerson(maxSize);
        arrayPerson.insert("Zhirnova", "Victoria", 37);
        arrayPerson.insert("Popov", "Roman", 24);
        arrayPerson.insert("Stimson", "Stimson", 21);
        arrayPerson.displayA();
        System.out.println();
        Person person = arrayPerson.find("Zhirnova");
        person.displayPerson();

        OrdArray arr = new OrdArray(100);
        arr.insert(72);
        arr.insert(90);
        arr.insert(126);
        arr.insert(54);
        arr.insert(99);
        arr.insert(144);
        arr.insert(27);
        arr.display();
        int searchKey = 27;
        if (arr.find(searchKey) !=arr.size()) {
            System.out.println("Found " + searchKey);
        } else{
            System.out.println("Can not Found " + searchKey);
        }
    }
}
