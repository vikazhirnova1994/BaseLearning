package datastruct.queue;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(10); // Вставка 4 элементов
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        // Извлечение 3 элементов (10, 20, 30)
        queue.remove();
        queue.remove();
        queue.remove();
        // Вставка еще 4 элементов с циклическим переносом
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        // Извлечение и вывод элемнетов
        while (!queue.isEmpty()){
            long n = queue.remove(); // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(30);
        priorityQ.insert(50);
        priorityQ.insert(10);
        priorityQ.insert(40);
        priorityQ.insert(20);
        while(!priorityQ.isEmpty()){
            long item = priorityQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        }
    }
}
