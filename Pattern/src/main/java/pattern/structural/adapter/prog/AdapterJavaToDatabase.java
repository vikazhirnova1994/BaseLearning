package pattern.structural.adapter.prog;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
