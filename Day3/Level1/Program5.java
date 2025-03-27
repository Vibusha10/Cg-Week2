class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("University Name: " + universityName);
        System.out.println("Name           : " + name);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Grade          : " + grade);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
}

public class Program5 {
    public static void main(String[] args) {
        Student s1 = new Student("Ananya", 101, "A");
        Student s2 = new Student("Rahul", 102, "B");

        if (s1 instanceof Student) s1.displayDetails();
        if (s2 instanceof Student) s2.displayDetails();

        Student.displayTotalStudents();

        System.out.println("\nUpdating Grade for Rahul...");
        if (s2 instanceof Student) {
            s2.updateGrade("A+");
            s2.displayDetails();
        }
    }
}
