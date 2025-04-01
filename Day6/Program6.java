import java.util.*;

abstract class Ticket {
    private String ticketId;
    private String eventName;
    private double ticketPrice;
    private int quantity;

    public Ticket(String ticketId, String eventName, double ticketPrice, int quantity) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
        this.quantity = quantity;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTicketDetails() {
        return "Ticket ID: " + ticketId + ", Event: " + eventName + ", Price: " + ticketPrice + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Refundable {
    void requestRefund();
    String getRefundDetails();
}

class ConcertTicket extends Ticket implements Refundable {
    private static final double CONCERT_SERVICE_CHARGE = 5.0;

    public ConcertTicket(String ticketId, String eventName, double ticketPrice, int quantity) {
        super(ticketId, eventName, ticketPrice, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getTicketPrice() + CONCERT_SERVICE_CHARGE) * getQuantity();
    }

    @Override
    public void requestRefund() {
        System.out.println("Refund requested for Concert Ticket: " + getTicketId());
    }

    @Override
    public String getRefundDetails() {
        return "Refund details for Concert Ticket: A processing fee of $2 applies.";
    }
}

class MovieTicket extends Ticket implements Refundable {
    private static final double MOVIE_SERVICE_CHARGE = 3.0;

    public MovieTicket(String ticketId, String eventName, double ticketPrice, int quantity) {
        super(ticketId, eventName, ticketPrice, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getTicketPrice() + MOVIE_SERVICE_CHARGE) * getQuantity();
    }

    @Override
    public void requestRefund() {
        System.out.println("Refund requested for Movie Ticket: " + getTicketId());
    }

    @Override
    public String getRefundDetails() {
        return "Refund details for Movie Ticket: A processing fee of $1 applies.";
    }
}

public class Program6 {
    public static void main(String[] args) {
        List<Ticket> ticketOrder = new ArrayList<>();

        ConcertTicket concertTicket1 = new ConcertTicket("C123", "Rock Concert", 50.0, 2);
        MovieTicket movieTicket1 = new MovieTicket("M456", "Blockbuster Movie", 12.0, 3);

        ticketOrder.add(concertTicket1);
        ticketOrder.add(movieTicket1);

        for (Ticket ticket : ticketOrder) {
            System.out.println(ticket.getTicketDetails());
            System.out.println("Total Price: " + ticket.calculateTotalPrice());
            if (ticket instanceof Refundable) {
                Refundable refundableTicket = (Refundable) ticket;
                refundableTicket.requestRefund();
                System.out.println(refundableTicket.getRefundDetails());
            }
            System.out.println("----------");
        }
    }
}