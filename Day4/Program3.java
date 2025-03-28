import java.util.*;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String toString() {
        return name + " (" + position + ")";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName, String position) {
        employees.add(new Employee(employeeName, position));
    }

    public void listEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("  - " + emp);
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName, String position) {
        for (Department dept : departments) {
            if (deptName.equals(dept.getName())) {
                dept.addEmployee(empName, position);
                return;
            }
        }
        System.out.println("Department not found: " + deptName);
    }

    public void listStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.listEmployees();
        }
    }

    public void closeCompany() {
        departments.clear();
        System.out.println("Company '" + name + "' has been closed. All departments and employees removed.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Company myCompany = new Company("TechNova");

        myCompany.addDepartment("Engineering");
        myCompany.addDepartment("HR");

        myCompany.addEmployeeToDepartment("Engineering", "Alice", "Software Engineer");
        myCompany.addEmployeeToDepartment("Engineering", "Bob", "DevOps Engineer");
        myCompany.addEmployeeToDepartment("HR", "Eve", "Recruiter");

        myCompany.listStructure();

        myCompany.closeCompany();
    }
}
