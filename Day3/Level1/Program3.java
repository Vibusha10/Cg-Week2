import java.util.Scanner;

class Employee{
    static String companyName = "SunKid";
    String name;
    int Id;
    final String designation;
    static int totalEmployees = 0;

    public Employee(String name,int Id,String designation){
        this.name = name;
        this.Id = Id;
        this.designation = designation;
        totalEmployees += 1;
    }

    public void displayTotalEmployees(){
        System.out.println("\nTotal Employees : " + totalEmployees);
    }

    public void displayDetails(){
        System.out.println("\nEmployee Details : ");
        System.out.println("Company Name : " + companyName);
        System.out.println("Name : " + name);
        System.out.println("Id : " + Id);
        System.out.println("Designation : " + designation);
    }
}
public class Program3{
    public static void main(String[] args){

        Employee e1 = new Employee("Alice", 101, "Developer");
        e1.displayDetails();

        Employee e2 = new Employee("Bob", 102, "Manager");
        e2.displayDetails();

        Employee e3 = new Employee("Charlie", 103, "Tester");
        e3.displayDetails();

        e1.displayTotalEmployees();

        System.out.println("\nIs it a instance : " + (e2 instanceof Employee));
    }
}