import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public String toString() {
        return "Patient: " + name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            addPatient(patient);
        }
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String toString() {
        return "Doctor: " + name;
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Hospital: " + name + "\nDoctors:\n");
        for (Doctor d : doctors) {
            sb.append("  ").append(d.getName()).append("\n");
        }
        sb.append("Patients:\n");
        for (Patient p : patients) {
            sb.append("  ").append(p.getName()).append("\n");
        }
        return sb.toString();
    }
}

public class Program6 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.consult(alice);
        drJones.consult(alice);
        drJones.consult(bob);

        System.out.println("\n=== Doctor-Patient Relationships ===");
        System.out.println(drSmith + " has patients: " + drSmith.getPatients());
        System.out.println(drJones + " has patients: " + drJones.getPatients());

        System.out.println(alice + " has doctors: " + alice.getDoctors());
        System.out.println(bob + " has doctors: " + bob.getDoctors());
    }
}
