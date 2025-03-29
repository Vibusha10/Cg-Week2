import java.util.Scanner;

class Order{
    protected int orderId;
    protected String orderDate;

    public Order(int orderId,String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate; 
    }

    public String getOrderStatus(){
        return "Order Placed";
    }

    public void displayDetails(){
        System.out.println("\nOrder details : ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Order Status : " + getOrderStatus());
    }
}

class ShippedOrder extends Order{
    protected int trackingNumber;

    public ShippedOrder(int orderId,String orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus(){
        return "Order Shipped";
    }

    public void displayDetails(){
        System.out.println("\nOrder details : ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Order Status : " + getOrderStatus());
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus(){
        return "Order Delivered";
    }

    public void displayDetails(){
        System.out.println("\nOrder details : ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Delivery Date : " + deliveryDate);
        System.out.println("Order Status : " + getOrderStatus());
    }
}

public class Program6{
    public static void main(String[] args) {
        Order order = new Order(101, "2025-04-10");
        order.displayDetails();

        ShippedOrder shipped = new ShippedOrder(102, "2025-04-09", 555123);
        shipped.displayDetails();

        DeliveredOrder delivered = new DeliveredOrder(103, "2025-04-08", 555789, "2025-04-11");
        delivered.displayDetails();
    }
}