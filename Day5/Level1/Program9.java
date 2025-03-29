import java.util.Scanner;

class Person{
    String name;
    int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Person{
    String subject;
    
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }
    
    public void displayRole(){
        System.out.println("Role : Teacher");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person{
    char grade;
    
    public Student(String name,int age,char grade){
        super(name,age);
        this.grade = grade;
    }
    
    public void displayRole(){
        System.out.println("Role : Student");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person{
    
    public Staff(String name,int age){
        super(name,age);
    }
    
    public void displayRole(){
        System.out.println("Role : Staff");
    }
    
    public void displayDetails(){
        super.displayDetails();
    }
}
public class Program9 {
    public static void main(String[] args) {
        System.out.println("TEACHER");
        Teacher t = new Teacher("Alice", 35, "Mathematics");
        t.displayDetails();
        t.displayRole();

        System.out.println("\nSTUDENT");
        Student s = new Student("Bob", 16, 'A');
        s.displayDetails();
        s.displayRole();

        System.out.println("\nSTAFF");
        Staff st = new Staff("Charlie", 40);
        st.displayDetails();
        st.displayRole();
    }
}