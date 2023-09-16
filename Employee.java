
public class Employee extends Person {
    private double wage;
    private int workingHours;

    public Employee(String firstName, String lastName, String address, double wage) {
        super(firstName, lastName, address);
        this.wage = wage;
        this.workingHours = 0;
    }

    public void addHours(int hours) {
        this.workingHours += hours;
    }

    public double getPaycheck() {
        if (this.workingHours <= 165) {
            return wage;
        } else {
            return wage + ((this.workingHours - 165) * (wage / 165) * 1.5);
        }
    }

    public String getEmployeeInfo() {
        return  "Employee's information:\n" +
                "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Salary Rate: $" + this.wage + "\n" +
                "Hours: " + this.workingHours + "\n" +
                "Paid: $" + getPaycheck();
    }
}