
public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }
}
