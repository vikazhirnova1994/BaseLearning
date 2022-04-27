package datastruct.hashTable.lineHashTable;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class HashTable {

    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem =  new DataItem(-1);
    }

    public void displayTable(){
        System.out.println("HashTable");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.print(hashArray[i].getKey() + " ");
            }
            else {
                System.out.print("**");
            }
        }
        System.out.println();
    }

    public int hashFunc1(int key){
        return key % arraySize;
    }

    public void insert(DataItem item){
        int key = item.getKey(); //получение ключа
        int hashVal = hashFunc1(key); //хэширование ключа
        while (hashArray[hashVal] != null &&
                hashArray[hashVal].getKey() !=-1){ //поиск пустой ячейки и ячейки со значением -1
            ++hashVal; //переход к другой ячейке
            hashVal %= arraySize; //возврат к началу
        }
        hashArray[hashVal] = item;// вставка элемнета
    }

    public DataItem delete(int key){
        int hashVal = hashFunc1(key);//хэшируем ключ
        while (hashArray[hashVal] != null ) { //пока не найдена пустая ячейка
            if (hashArray[hashVal].getKey() == key) { // поиск совпадения
                DataItem temp = hashArray[hashVal]; //сохранение значения обнаруженного совпадения
                hashArray[hashVal] = nonItem; //удаление элемнета
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem find(int key){
        int hashVal = hashFunc1(key);
        while (hashArray[hashVal] != null ) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
}
