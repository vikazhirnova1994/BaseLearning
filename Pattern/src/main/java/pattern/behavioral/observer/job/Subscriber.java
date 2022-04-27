package pattern.behavioral.observer.job;

import java.util.List;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Subscriber implements  Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n===============================================\n");
    }
}
