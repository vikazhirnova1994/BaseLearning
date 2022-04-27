package pattern.behavioral.tempMethod.coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class CoffeeWithHook extends CoffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping coffee from filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    @Override
    public boolean customerWantCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }
    public String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        if (answer == null){
            answer = "no";
        }
        return answer;
    }
}
