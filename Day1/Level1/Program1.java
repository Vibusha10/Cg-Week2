import java.util.Scanner;

class Employee{

    String name;
    int id;
    int salary;

    public Employee(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary; 
    }

    public void displayDetails(){
        System.out.println("Employee Details");
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    } 
}

public class Program1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();
        
        System.out.print("Enter Employee ID: ");
        int employeeId = input.nextInt();

        System.out.print("Enter Employee Salary: ");
        int employeeSalary = input.nextInt();

        Employee employeeRecord = new Employee(employeeName,employeeId,employeeSalary);
        employeeRecord.displayDetails(); 
    }
}