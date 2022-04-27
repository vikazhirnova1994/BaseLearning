package pattern.structural.bridge;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Program[] programs =  {
           new BankSystem(new CppDeveloper()),
           new StockExchange(new JavaDeveloper())
        };
        for(Program program: programs){
            program.developProgram();
        }
    }
}
