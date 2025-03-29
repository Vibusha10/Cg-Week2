import java.util.Scanner;

class Employee{
    String name;
    int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("\nEmployee Details : ");
        System.out.println("Name : " + name);
        System.out.println("ID: " + id);
    }
}

class Manager extends Employee{
    int teamSize;
    
    public Manager(String name,int id,int teamSize){
        super(name,id);
        this.teamSize = teamSize;
    }

    public void displayDetails(){
        System.out.println("\nManager Details : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Team Size : " + teamSize);
    }
}

class Developer  extends Employee{
    String programmingLanguage;
    
    public Developer(String name,int id,String programmingLanguage){
        super(name,id);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        System.out.println("\nDeveloper Details : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

class Intern extends Employee{
    String programmingLanguage;
    
    public Intern(String name,int id,String programmingLanguage){
        super(name,id);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        System.out.println("\nIntern Details : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

public class Program2{
    public static void main(String[] args){

        Employee emp = new Employee("Alice", 1001);
        emp.displayDetails();

        Manager mgr = new Manager("Bob", 2002, 5);
        mgr.displayDetails();

        Developer dev = new Developer("Charlie", 3003, "Java");
        dev.displayDetails();

        Intern intern = new Intern("David", 4004, "Python");
        intern.displayDetails();
    }
}