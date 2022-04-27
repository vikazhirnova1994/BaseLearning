package pattern.behavioral.command;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class UpdateCommand implements Command {

    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
