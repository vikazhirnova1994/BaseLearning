package datastruct.hashTable.chainHash;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class HashTable {
    private SortedList[] hashArray;//массив списков ключей
    private int arraySize;

    public HashTable(int size) {
       arraySize = size;
       hashArray = new SortedList[arraySize];
        for (int i = 0; i <arraySize ; i++) {
            hashArray[i] = new SortedList();
        }
    }

    public void displayTable(){
        for (int i = 0; i < arraySize; i++) {
            System.out.println(i + ": ");
            hashArray[i].displayList();
        }
    }

    public int hashFunc(int key){
        return key % arraySize;
    } //функция хэширования

    public void insert(Link theLink){
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete( int key){
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find( int key){
        int hashVal = hashFunc(key);
        Link thelink = hashArray[hashVal].find(key);
        return thelink;
    }
}
