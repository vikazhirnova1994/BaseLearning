package pattern.behavioral.command;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
          new InsertCommand(database),
          new UpdateCommand(database),
          new SelectCommand(database),
          new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
