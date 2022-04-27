package pattern.behavioral.stragedy.prog;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

    }
}
