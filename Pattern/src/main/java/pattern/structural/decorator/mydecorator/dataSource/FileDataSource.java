package pattern.structural.decorator.mydecorator.dataSource;

import java.io.*;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class FileDataSource implements DataSource{
    private String name;


    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (FileWriter fos = new FileWriter(file)) {
            fos.write(data, 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
