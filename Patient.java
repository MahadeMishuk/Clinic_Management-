
public class Patient extends Person {
    private String primaryPhysician;
    private String lastVisitedDoctor;

    public Patient(String firstName, String lastName, String address, String primaryPhysician) {
        super(firstName, lastName, address);
        this.primaryPhysician = primaryPhysician;
        this.lastVisitedDoctor = "";
    }

    public void visit(String doctorLastName) {
        this.lastVisitedDoctor = doctorLastName;
    }

    public String getPrimaryPhysician() {
        return this.primaryPhysician;
    }
}