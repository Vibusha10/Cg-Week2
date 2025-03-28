import java.util.*;

class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void listEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }

    public void listCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("  - " + c.getName());
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listAllStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("  - " + s.getName());
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        School mySchool = new School("Green Valley High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        mySchool.addStudent(alice);
        mySchool.addStudent(bob);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);

        mySchool.listAllStudents();
        System.out.println();

        alice.listCourses();
        bob.listCourses();
        System.out.println();

        math.listEnrolledStudents();
        science.listEnrolledStudents();
    }
}
