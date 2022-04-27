package pattern.structural.proxy;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class ProxyProject implements Project{
    private String url;
    private RealProject realProject;


    public ProxyProject(String url) {
        this.url = url;
    }

    //создание RealProject, если он не создан
    @Override
    public void run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
