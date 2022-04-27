package pattern.behavioral.chain;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager:" + message);
    }
}
