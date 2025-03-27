class Vehicle {
    static double registrationFee = 2500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
    }

    public void displayDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Owner Name         : " + ownerName);
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee   : " + registrationFee);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Priya", "Car", "TN01AB1234");
        Vehicle v2 = new Vehicle("Karan", "Bike", "KA05XY5678");

        if (v1 instanceof Vehicle) v1.displayDetails();
        if (v2 instanceof Vehicle) v2.displayDetails();

        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(3000.0);

        if (v1 instanceof Vehicle) v1.displayDetails();
        if (v2 instanceof Vehicle) v2.displayDetails();
    }
}