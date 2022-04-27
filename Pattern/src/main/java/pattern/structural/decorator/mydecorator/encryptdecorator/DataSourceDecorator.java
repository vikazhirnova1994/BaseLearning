package pattern.structural.decorator.mydecorator.encryptdecorator;

import pattern.structural.decorator.mydecorator.dataSource.DataSource;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
