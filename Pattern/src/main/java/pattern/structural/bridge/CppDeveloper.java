package pattern.structural.bridge;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Cpp Developer writes C++ code...");
    }
}
