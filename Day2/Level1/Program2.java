import java.util.Scanner;

class Circle{

    int radius;

    public Circle(){
        this.radius = 45; 
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void displayDetails(){
        System.out.println("\nCircle Details : ");
        System.out.println("Radius : " + radius);
    }
}

public class Program2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Circle circleDetails1 = new Circle();
        circleDetails1.displayDetails();

        System.out.print("\nEnter the radius : ");
        int radius = input.nextInt();

        Circle circleDetails2 = new Circle(radius);
        circleDetails2.displayDetails();
    }
}