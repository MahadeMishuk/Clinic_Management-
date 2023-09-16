
import java.util.Scanner;

public class Clinic {
    private static Doctor[] doctors = new Doctor[3];
    private static Employee[] employees = new Employee[2];
    private static Patient[] patients = new Patient[10];
    private static int patientCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        doctors[0] = new Doctor("John", "Blake", "400 Main St", "Dermatologist", 150);
        doctors[1] = new Doctor("Sara", "Frost", "300 Kim St", "Pediatric", 150);
        doctors[2] = new Doctor("Michael", "Willis", "23 Lake St", "PCP", 100);

        employees[0] = new Employee("John", "Jones", "13 Dulaney St", 2000);
        employees[1] = new Employee("James", "Harison", "27 Crate St", 3200);

        while (true) {
            System.out.println("Is this a new Patient?");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                System.out.println("Patient's first name:");
                String firstName = scanner.nextLine();

                System.out.println("Patient's last name:");
                String lastName = scanner.nextLine();

                System.out.println("Patient's address:");
                String address = scanner.nextLine();

                System.out.println("Patient's primary care doctor:");
                String primaryCareDoctor = scanner.nextLine();

                patients[patientCount++] = new Patient(firstName, lastName, address, primaryCareDoctor);

            } else if (response.equals("no")) {
                System.out.println("Patient's last name:");
                String lastName = scanner.nextLine();

                System.out.println("Doctor's name:");
                String doctorName = scanner.nextLine();

                for (Patient patient : patients) {
                    if (patient != null && patient.getLastName().equals(lastName)) {
                        patient.visit(doctorName);
                        
                        for (Doctor doctor : doctors) {
                            if (doctor.getLastName().equals(doctorName)|| doctor.getLastName().equals(patient.getPrimaryPhysician())) {
                                doctor.addVisit();
                            }
                        }
                        break;
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                continue;
            }

            System.out.println("More patients?");
            if (scanner.nextLine().trim().toLowerCase().equals("no")) {
                break;
            }
        }

        for (Doctor doctor : doctors) {
            if (doctor != null) {
                System.out.println(doctor.getDoctorsInfo() + "\n");
            }
        }

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeInfo() + "\n");
            }
        }

        scanner.close();
    }
}