package datastruct.heap;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Heap {
    private Node[] heapArray; // массив значений узлов
    private int maxSize; //размер массива
    private int currentSize; //количество узлов

    public Heap(int mx) {
        maxSize = mx;
        currentSize = 0;
        heapArray = new  Node[maxSize];
    }

    public boolean isEmpty(){
        return currentSize ==0;
    }

    public boolean insert(int key){
        if (currentSize == maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode; //размещение в конце массива
        trickleUp(currentSize++); //смещение вверх
        return true;
    }
    public void trickleUp(int index){
        int parent = (index-1)/2;
        Node bottom = heapArray[index];
        while (index > 0 &&
                    heapArray[parent].getKey() < bottom.getKey()){
            heapArray[index] = heapArray[parent]; //узел перемещается вних
            index = parent; //индекс перемещает вверх
            parent = (parent -1)/2; //индек подительского узла замещается индексом его родителя
        }
        heapArray[index] = bottom;
    }
    public Node remove(){
        Node root= heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    public void trickleDown(int index){
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize/2) { //пока есть потомок
            int leftChild = 2 * index - 1;
            int rightChild = leftChild + 1;
            //существует ли правый потомок
            if (rightChild < currentSize &&
                    heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else
                largerChild = leftChild;
            //если значение родителя больше потомка
            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild]; //потомок поднимается выше
            index = largerChild; //инзменяем индекс, смещая вниз
        }
        heapArray[index] = top; //смещаем га место по значению индекса
        }

        public boolean change (int index, int newValue){
            if (index < 0 || index > currentSize) {
                return false;
            }
            int OldValue = heapArray[index].getKey(); //сохрание старого ключа , присвоение нового
            heapArray[index].setKey(newValue); //присвоение нового ключа
            if (OldValue < newValue) //если старое значение меньше
                trickleUp(index); //новое значение перемещаем на вверх
            else //если старое значение меньше
                trickleDown(index);//новое значение перемещаем вниз
        return true;
        }
        public void displayHeap(){
            System.out.print("heapArray: ");
            for (int i = 0; i < currentSize; i++) {
                if (heapArray[i] != null)
                    System.out.print(heapArray[i].getKey() + " ");
                else
                    System.out.print("--");
            }
            System.out.println();
            //формат пирамиды
            int nBlanks = 32;
            int itemsPerRow = 1;
            int column =0;
            int j = 0; //текущий элемент
            String dots = "...............................";
            System.out.println(dots+dots);
            while (currentSize > 0){
                if (column == 0){
                    for (int i = 0; i < nBlanks; i++) { //вывод пробелов
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey()  + " ");
                if (++j == currentSize){
                    break;
                }
                if (++column == itemsPerRow){ //конец строки
                    nBlanks/=2; //половина пробелов
                    itemsPerRow*=2; //больше узлов
                    column=0;
                    System.out.println();
                } else { //след эдемент в строке
                    for (int i = 0; i < nBlanks*2 -2; i++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("\n"+ dots+dots);
        }
    }

