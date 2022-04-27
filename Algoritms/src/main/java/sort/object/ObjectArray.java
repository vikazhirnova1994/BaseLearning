package sort.object;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class ObjectArray {
    private Person[] a;
    private int numberOfElem;

    public ObjectArray(int max) {
        a = new Person[max];
        numberOfElem = 0;
    }

    public void insert(String last, String first, int age){
        a[numberOfElem] = new Person(last, first, age);
        numberOfElem++;
    }

    public void display(){
        for (int j = 0; j < numberOfElem; j++) {
            a[j].displayPerson();
        }
        System.out.println();
    }

    public void insertionSort(){
        int in, out;
        for (out = 0; out < numberOfElem; out++) {
            Person temp = a[out];
            in = out;
            while (in>0 && a[in-1].getLast().compareTo(temp.getLast())>0){ // Пока не найден меньший элемент
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }
}
