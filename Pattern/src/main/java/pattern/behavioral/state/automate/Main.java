package pattern.behavioral.state.automate;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {

    public static void main(String[] args) {
       AutoMateWithoutState gumball = new AutoMateWithoutState(5);
        System.out.println(gumball);
        gumball.insertQuarter();
        gumball.turnTheCrank();
        System.out.println(gumball);
    }
}
