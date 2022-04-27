package pattern.creational.prototype;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */


//создает проекты
public class ProjectFactory {


    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
