import java.util.Scanner;

class Circle{

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return (Math.PI * Math.pow(radius,2));
    }

    public double calculateCircumference(){
        return (2 * Math.PI * radius);
    }

    public void displayCircleDetails(double area,double circumference){
        System.out.println("Circle Details");
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }
}

public class Program2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        int radius = input.nextInt();

        Circle details = new Circle(radius);

        double area = details.calculateArea();
        double circumference = details.calculateCircumference();
        details.displayCircleDetails(area,circumference);
    }
}