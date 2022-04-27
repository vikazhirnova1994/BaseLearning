package pattern.structural.proxy;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */



public class ProjectRunner {
    public static void main(String[] args) {
        /*Project realProject = new RealProject("https://www.github.com/realProject");
        realProject.run();*/
        ProxyProject proxy = new ProxyProject("https://www.github.com/realProject");
        proxy.run();
    }
}
