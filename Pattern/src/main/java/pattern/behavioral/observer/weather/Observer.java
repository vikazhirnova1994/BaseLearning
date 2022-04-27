package pattern.behavioral.observer.weather;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public interface Observer {
    public void update(Observer observer, Object arg);
}
