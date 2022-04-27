package pattern.behavioral.observer.job;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class JavaDeveloperJobSite implements Observed  {

    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            //вызов у подписчиков метод
            observer.handleEvent(this.vacancies);
        }
    }
}
