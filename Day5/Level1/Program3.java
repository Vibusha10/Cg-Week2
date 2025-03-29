import java.util.Scanner;

class Vehicle{
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    
    public void displayInfo(){
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Fuel Type : " + fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;

    public Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    
    public void displayInfo(){
        System.out.println("Car Details : ");
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }

}

class Truck extends Vehicle{
    int loadCapacity;

    public Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity = loadCapacity;
    }
    
    public void displayInfo(){
        System.out.println("\nTruck Details : ");
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity);
    }
}

class Motorcycle extends Vehicle{
    int seatCapacity;

    public Motorcycle(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    
    public void displayInfo(){
        System.out.println("\nMotorcycle Details : ");
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}

public class Program3{
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 8000);
        vehicles[2] = new Motorcycle(160, "Petrol", 2);

        for (Vehicle v : vehicles){
            v.displayInfo();
        }
    }
}
