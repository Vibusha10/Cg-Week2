import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Student: " + name + "\nEnrolled Courses:\n");
        for (Course c : enrolledCourses) {
            sb.append("  ").append(c.getCourseName()).append("\n");
        }
        return sb.toString();
    }
}

class Professor {
    private String name;
    private List<Course> coursesTaught = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
            course.assignProfessor(this);
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Professor: " + name + "\nCourses Taught:\n");
        for (Course c : coursesTaught) {
            sb.append("  ").append(c.getCourseName()).append("\n");
        }
        return sb.toString();
    }
}

class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Course: " + courseName + "\nProfessor: ");
        sb.append(professor != null ? professor.getName() : "None").append("\nStudents:\n");
        for (Student s : students) {
            sb.append("  ").append(s.getName()).append("\n");
        }
        return sb.toString();
    }
}

public class Program8 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        p1.assignCourse(c1);
        p1.assignCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(p1);
        System.out.println(c1);
        System.out.println(c2);
    }
}
