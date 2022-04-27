package pattern.behavioral.observer.job;

import java.util.List;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public interface Observer {
    //обработать событие
    public void handleEvent(List<String> vacancies);
}
