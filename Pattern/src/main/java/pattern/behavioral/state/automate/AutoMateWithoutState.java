package pattern.behavioral.state.automate;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class AutoMateWithoutState {

    final static int SOLD_OUT = 0;
    final static int NO_QAURTER = 1;
    final static int HAS_QAURTER = 2;
    final static int SOLD = 3;
    int state =  SOLD_OUT;
    int count = 0; //количнство шаров автомате

    public AutoMateWithoutState(int count) {
        this.count = count;
    }

    public void insertQuarter(){
        if (state == HAS_QAURTER) {
            System.out.println("You can not insert another quarter");
        }else if (state == NO_QAURTER){
            state =  HAS_QAURTER;
            System.out.println("You insert a quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You have not insert a quarter");
        } else if (state == SOLD){
            System.out.println("Please, wait? we are already giving you a gumball");
        }
    }

    public void ejectQuarter(){
        if (state == HAS_QAURTER) {
            System.out.println("Quarter returned");
            state = NO_QAURTER;
        }else if (state == NO_QAURTER){
            System.out.println("You insert a quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You con not  eject, you can not insert another quarter");
        } else if (state == SOLD){
            System.out.println("Sorry, You are already turned the crank");
        }
    }

    public void turnTheCrank(){
        if (state == HAS_QAURTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispence();
        }else if (state == NO_QAURTER){
            System.out.println("You turned but there is no quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You turned but there is no gumballs");
        } else if (state == SOLD){
            System.out.println("turned twice does not get you another gumball");
        }
    }

    public  void dispence(){
        if (state == HAS_QAURTER) {
            System.out.println("No gumball dispensed");
            state = SOLD;
            state = NO_QAURTER;
        }else if (state == NO_QAURTER){
            System.out.println("You need to play first..");
        } else if (state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        } else if (state == SOLD){
            System.out.println("turned twice does not get you another gumball");
            count = count -1;
            if (count == 0) {
                System.out.println();
                state = SOLD_OUT;
            }else
                state = NO_QAURTER;
        }
    }

}
