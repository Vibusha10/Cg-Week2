import java.util.Scanner;

class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "SSN";

    public Course(String courseName,int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    static void updateInstituteName() {
        instituteName = "SRM";
        System.out.println("\nInstitue Name: " + instituteName);
    }
}

public class Program2 {
    public static void main(String[] args) {
        
        System.out.println("Course 1 : ");
        Course c1 = new Course("CSE",4,50000);
        c1.displayCourseDetails();
        
        System.out.println("\nCourse 2 : ");
        Course c2 = new Course("EEE",3,45500);
        c2.displayCourseDetails();
        
        Course.updateInstituteName();
    }
}