package pattern.structural.bridge;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
