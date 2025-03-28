import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Faculty: " + name;
    }
}

class Department {
    private String name;
    private List<Faculty> facultyMembers = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Department: " + name + ", Faculty: [");
        for (int i = 0; i < facultyMembers.size(); i++) {
            sb.append(facultyMembers.get(i).getName());
            if (i < facultyMembers.size() - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("University: " + name + "\n");
        for (Department dept : departments) {
            sb.append("  ").append(dept.toString()).append("\n");
        }
        return sb.toString();
    }

    public void clearUniversity() {
        departments.clear();
        System.out.println("University and all its departments have been deleted.");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Faculty alice = new Faculty("Dr. Alice");
        Faculty bob = new Faculty("Dr. Bob");

        University uni = new University("Tech University");

        Department csDept = uni.addDepartment("Computer Science");
        Department mathDept = uni.addDepartment("Mathematics");

        csDept.addFaculty(alice);
        mathDept.addFaculty(bob);

        System.out.println("=== University Structure ===");
        System.out.println(uni);

        System.out.println("\nDeleting the university...");
        uni.clearUniversity();

        System.out.println("\n=== Faculty Members After University Deletion ===");
        System.out.println(alice);
        System.out.println(bob);
    }
}
