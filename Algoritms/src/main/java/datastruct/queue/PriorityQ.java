package datastruct.queue;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int numItems;

    public PriorityQ(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        numItems = 0;
    }
    public void insert(long item){
        int i;
        if (numItems==0) // Если очередь пуста
            queArray[numItems++] = item; // вставляем в ячейку 0
        else {
            for (i = numItems-1; i>=0; i--) { // Перебор в обратном направлении
                if (item > queArray[i]) // Если новый элемент больше
                    queArray[i+1]= queArray[i];// сдвинуть вверх
                else break;
            }
            queArray[i+1]= item;// Вставка элемента
            numItems++;
        }
    }

    public long remove(){
        return queArray[--numItems];
    } // Извлечение минимального элемента

    public long peerMin(){
        return queArray[numItems-1];
    } // Чтение минимального элемента

    public boolean isEmpty(){ // true, если очередь пуста
        return numItems==0;
    }

    public boolean isFull(){
        return numItems==maxSize;
    }
}
