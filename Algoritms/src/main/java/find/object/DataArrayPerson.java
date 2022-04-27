package find.object;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class DataArrayPerson {
    private Person[] a;
    private int numberOfElnm;

    public DataArrayPerson( int maxSize) {
        a = new Person[maxSize];
        numberOfElnm = 0;
    }

    public void insert(String last, String first, int age) {

        a[numberOfElnm] = new Person(last, first, age); // Вставка
        numberOfElnm++; // Увеличение размера
    }

    public Person find(String searchLastName) {
        int j;
        for (j = 0; j < numberOfElnm; j++) {
            if (a[j].getLastName().equals(searchLastName)) break;
        }
        if (j == numberOfElnm)
            return null;
        else
            return a[j];

    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < numberOfElnm; j++) {
            if (a[j].getLastName().equals(searchName)) break;
        }
        if (j == numberOfElnm) {
            return false;
        } else {
            for (int k = j; k < numberOfElnm; k++) {
                a[k] = a[k + 1];
            }
            numberOfElnm--;
            return true;
        }
    }

    public void displayA() {
        for (int i = 0; i < numberOfElnm; i++) {
            a[i].displayPerson();
        }
    }
}
