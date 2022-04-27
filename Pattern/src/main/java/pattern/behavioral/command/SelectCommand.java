package pattern.behavioral.command;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class SelectCommand implements Command {

    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
