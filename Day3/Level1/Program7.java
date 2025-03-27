class Patient {
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        System.out.println("\nPatient Details:");
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient ID    : " + patientID);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Ailment       : " + ailment);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Meera", 30, "Flu", 1);
        Patient p2 = new Patient("Ramesh", 45, "Fracture", 2);

        if (p1 instanceof Patient) p1.displayDetails();
        if (p2 instanceof Patient) p2.displayDetails();

        Patient.getTotalPatients();
    }
}
