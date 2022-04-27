package pattern.behavioral.observer.job;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Victoria Zhirnova");
        Observer secondSubscriber = new Subscriber("Roman Popov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");
    }
}
