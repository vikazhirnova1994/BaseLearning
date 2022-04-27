package pattern.structural.decorator.mydecorator;

import pattern.structural.decorator.mydecorator.dataSource.DataSource;
import pattern.structural.decorator.mydecorator.dataSource.FileDataSource;
import pattern.structural.decorator.mydecorator.encryptdecorator.DataSourceDecorator;
import pattern.structural.decorator.mydecorator.encryptdecorator.EncryptionDecorator;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {

        String salaryRecords = "Виктория,100000";
        DataSourceDecorator encoded =
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt"));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        String encodedData = plain.readData();
        String decodedData = encoded.readData();
        System.out.printf("Введенные данные: %s\n", salaryRecords);
        System.out.printf("Закодированные данные: %s\n", encodedData);
        System.out.printf("Декодированные данные: %s\n", decodedData);
    }
}
