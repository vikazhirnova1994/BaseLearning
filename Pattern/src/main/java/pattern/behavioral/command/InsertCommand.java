package pattern.behavioral.command;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class InsertCommand implements Command {

    Database  database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
