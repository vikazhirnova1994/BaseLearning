package pattern.creational.prototype;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n=======================\n");
        System.out.println(masterClone);
    }

}
