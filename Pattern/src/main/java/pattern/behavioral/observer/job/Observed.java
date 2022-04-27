package pattern.behavioral.observer.job;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public interface Observed {
    //добавление наблюдателя
    public void addObserver(Observer observer);
    //удаление наблюдателя
    public void removeObserver(Observer observer);
    // уведомление наблюдателей
    public void notifyObservers();
}
