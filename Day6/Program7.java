import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_RATE = 100.0;
    private int daysAdmitted;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return DAILY_RATE * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 50.0;
    private String treatmentType;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, String treatmentType) {
        super(patientId, name, age);
        this.treatmentType = treatmentType;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE + (treatmentType.equalsIgnoreCase("special") ? 30.0 : 0.0);
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

public class Program7{
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("IP101", "John Doe", 45, 5);
        inPatient.addRecord("Admitted for chest pain");
        inPatient.addRecord("Surgery on day 3");

        OutPatient outPatient = new OutPatient("OP202", "Jane Smith", 30, "normal");
        outPatient.addRecord("Consultation for fever");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }
            System.out.println("----------");
        }
    }
}