package pattern.structural.bridge;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
