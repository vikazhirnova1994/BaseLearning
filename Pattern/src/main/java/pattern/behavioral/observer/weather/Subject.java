package pattern.behavioral.observer.weather;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Object arg);

}
