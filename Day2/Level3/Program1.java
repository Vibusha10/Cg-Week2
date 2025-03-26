import java.util.Scanner;

class Student{

    public int rollNumber;
    protected String name;
    private float CGPA;

    public Student(int rollNumber,String name,float CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(float CGPA){
        if (CGPA > 0.0 && CGPA <=10.0){
            this.CGPA = CGPA;
        }
        else{
            System.out.println("Invalid CGPA");
        }
    }

    public float getCGPA(){
        return CGPA;
    }

    public void displayDetails(){
        System.out.println("\nStudent Details : ");
        System.out.println("Roll Number : "  + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + CGPA);
    }
}

class PostGraduateStudent extends Student{
    private String specialization;

    public PostGraduateStudent(int rollNumber,String name,float CGPA,String specialization){
        super(rollNumber,name,CGPA);
        this.specialization = specialization;
    }

    public void displayPostGraduateStudentDetails(){
        System.out.println("\nPost Graduate Student Details : ");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + getCGPA());
        System.out.println("Specialization : " + specialization);
    }    
}

public class Program1{
    public static void main(String[] args){
        Student s1 = new Student(101, "Alice", 8.5f);
        s1.displayDetails();

        PostGraduateStudent p1 = new PostGraduateStudent(102, "Bob", 9.0f, "AI");
        p1.displayPostGraduateStudentDetails();

        p1.setCGPA(8.01f);
        System.out.println("\nUpdated CGPA : " + p1.getCGPA());
    }
}