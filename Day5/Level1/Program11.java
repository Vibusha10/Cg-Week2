import java.util.Scanner;

class Vehicle{
    int maxSpeed;
    String model;
    
    public Vehicle(int maxSpeed,String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    
    public void displayDetails(){
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Model : " + model);
    }
}

interface Refuelable {
    void refuel();
}

class  ElectricVehicle extends Vehicle{
    
    public ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    
    public void charge(){
        System.out.println(model + " is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{
    
    public PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    
    public void refuel(){
        System.out.println(model + " is refueling");
    }
}
public class Program11 {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        System.out.println("Electric Vehicle:");
        ev.displayDetails();
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");
        System.out.println("\nPetrol Vehicle:");
        pv.displayDetails();
        pv.refuel();
    }
}