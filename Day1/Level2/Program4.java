import java.util.Scanner;

class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("\nMovie Ticket Details");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price : " + price);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter MovieName : ");
        String  movieName = input.nextLine();
       
        System.out.print("Enter seat Number: ");
        int seatNumber = input.nextInt();

        System.out.print("Enter Price : ");
        double price = input.nextDouble();
        
        MovieTicket ticketDetails = new MovieTicket();

        ticketDetails.bookTicket(movieName,seatNumber,price);
        ticketDetails.displayTicketDetails();
    }
}
