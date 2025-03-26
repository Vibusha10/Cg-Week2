import java.util.Scanner;

class Vehicle {

    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    public Vehicle(String ownerName,String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    void displayVehicleDetails() {
        System.out.println("Course Name: " + ownerName);
        System.out.println("Duration: " + vehicleType);
    }

    public static void updateRegistrationFee() {
        registrationFee += 1200;
        System.out.println("\nFee: " + registrationFee);
    }
}

public class Program3 {
    public static void main(String[] args) {
        
        System.out.println("Vehicle 1 : ");
        Vehicle v1 = new Vehicle("Anu","Bike");
        v1.displayVehicleDetails();
        
        System.out.println("\nVehicle 2 : ");
        Vehicle v2 = new Vehicle("Banu","Scooty");
        v2.displayVehicleDetails();
        
        Vehicle.updateRegistrationFee();
    }
} 