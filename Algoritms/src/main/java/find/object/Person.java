package find.object;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void displayPerson(){
        System.out.print("\nlastName "+ lastName);
        System.out.print(", firstName "+ firstName);
        System.out.print(", age "+ age);

    }

    public String getLastName() {
        return lastName;
    }
}
