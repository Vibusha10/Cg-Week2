
import java.util.Scanner;

class HotelBooking{
    
    String guestName;
    String roomType;
    int nights;
    
    public HotelBooking(){
        this.guestName = "Anu";
        this.roomType = "Normal";
        this.nights = 2;
    }
    
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    
    public HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    
    public void displayDetails(){
        System.out.println("\nHotel Booking Details : ");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights : " + nights);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Guest Name : ");
        String guestName = input.nextLine();
        
        System.out.print("Enter the Room Type : ");
        String roomType = input.nextLine();
        
        System.out.print("Enter the number of Nights : ");
        int nights = input.nextInt();
        
        System.out.println("\nDefault Details");
        HotelBooking details1 = new HotelBooking();
        details1.displayDetails();
        
        System.out.println("\nUser Details");
        HotelBooking details2 = new HotelBooking(guestName,roomType,nights);
        details2.displayDetails();
        
        System.out.println("\nCopied Details");
        HotelBooking details3 = new HotelBooking(details2);
        details3.displayDetails();
    }
}

