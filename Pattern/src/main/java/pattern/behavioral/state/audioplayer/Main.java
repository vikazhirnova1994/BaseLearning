package pattern.behavioral.state.audioplayer;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
