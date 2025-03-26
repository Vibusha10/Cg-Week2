import java.util.Scanner;

class Student{
    String name;
    int rollnumber;
    int marks;

    public Student(String name,int rollnumber,int marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    public char calculateGrade(){
        if ( marks > 80){
            return 'A';
        }
        else if ( marks > 60){
            return 'B';
        }
        else if ( marks > 40){
            return 'C';
        }
        else{
            return 'F';
        }
    }

    public void displayDetails(char grade){
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollnumber);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
    } 
}

public class Program1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = input.nextLine();
        
        System.out.print("Enter Student Roll Number: ");
        int rollnumber = input.nextInt();

        System.out.print("Enter Student Marks : ");
        int marks = input.nextInt();

        Student studentRecord = new Student(name,rollnumber,marks);
        char grade = studentRecord.calculateGrade();
        studentRecord.displayDetails(grade);
    }
}