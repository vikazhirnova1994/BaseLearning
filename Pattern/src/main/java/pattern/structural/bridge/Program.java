package pattern.structural.bridge;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }
    public abstract void developProgram();
}
