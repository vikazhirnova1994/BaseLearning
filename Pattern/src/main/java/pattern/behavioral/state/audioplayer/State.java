package pattern.behavioral.state.audioplayer;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class State {
    Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
