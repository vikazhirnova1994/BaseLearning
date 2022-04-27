package pattern.behavioral.stragedy.prog;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Developer {
    Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
