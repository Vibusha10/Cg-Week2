import java.util.Scanner;

class CarRental{

    String customerName;
    String carModel;
    int rentalDays;
    int rentalAmount = 350;

    public CarRental(String customerName,String carModel,int rentalDays){
        this.customerName = customerName;
        this.carModel =  carModel;
        this.rentalDays = rentalDays;
    }

    public void displayDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total  Rental Amount : " + rentalDays * rentalAmount);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter customer name : ");
        String customerName = input.nextLine();
        
        System.out.print("Enter car model : ");
        String carModel = input.nextLine();
        
        System.out.print("Enter rental days : ");
        int rentalDays = input.nextInt();
        
        CarRental carRentalDetails = new CarRental(customerName,carModel,rentalDays);
        carRentalDetails.displayDetails();
    }
}