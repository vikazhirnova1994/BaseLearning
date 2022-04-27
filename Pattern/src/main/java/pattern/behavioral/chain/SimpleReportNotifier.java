package pattern.behavioral.chain;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
