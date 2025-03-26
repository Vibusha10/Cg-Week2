class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // Getter method to access salary
    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + getSalary());
    }
}

public class Program4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "HR", 50000);
        e1.displayEmployeeDetails();

        e1.setSalary(55000);
        System.out.println("Updated Salary for Employee: " + e1.getSalary());

        Manager m1 = new Manager(2001, "IT", 75000);
        m1.displayManagerDetails();

        m1.setSalary(80000);
        System.out.println("Updated Salary for Manager: " + m1.getSalary());
    }
}
