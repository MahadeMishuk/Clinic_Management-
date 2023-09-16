
public class Doctor extends Person {
	
    private String Specialty;
    private double VisitingFee;
    private int VisitedPatients;

    public Doctor(String firstName, String lastName, String address, String speciality, double visitingFee) {
        super(firstName, lastName, address);
        this.Specialty = speciality;
        this.VisitingFee = visitingFee;
        this.VisitedPatients = 0;
    }

    public String getSpecialties() {
        return this.Specialty;
    }

    public void addVisit() {
        this.VisitedPatients++;
    }

    public double getPaycheck() {
        return this.VisitedPatients * this.VisitingFee;
    }

    public String getDoctorsInfo() {
        return  "Doctor's information:\n" +
                "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Specialty: " + this.Specialty + "\n" +
                "Visiting fee: $" + this.VisitingFee + "\n" +
                "Total umber of visits: " + this.VisitedPatients + "\n" +
                "Paid: $" + getPaycheck();
    }
}
