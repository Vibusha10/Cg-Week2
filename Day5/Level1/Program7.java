import java.util.Scanner;

class Course{
    protected String courseName;
    protected int duration;

    public Course(String courseName,int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("\nCourse Details : ");
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration);
    }   
}

class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Platform : " + platform);
        System.out.println("Is Recorded : " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{
    private float fee;
    private int discount;

    public PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,float fee,int discount){
        super(courseName,duration,platform,isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fee : " + fee);
        System.out.println("Is Recorded : " + isRecorded);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Course basicCourse = new Course("Java Programming", 30);
        basicCourse.displayDetails();

        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 40, "Udemy", true);
        onlineCourse.displayDetails();

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 60, "Coursera", true, 4999.99f, 15);
        paidCourse.displayDetails();
    }
}
