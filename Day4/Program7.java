import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order() {
        this.orderId = idCounter++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Order #" + orderId + " - Products: ");
        for (Product p : products) {
            sb.append(p.toString()).append(", ");
        }
        sb.append("Total: $").append(getTotal());
        return sb.toString();
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Customer: " + name + "\nOrders:\n");
        for (Order o : orders) {
            sb.append("  ").append(o.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class Program7 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.00);

        Customer customer = new Customer("John Doe");

        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order();
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println(customer);
    }
}
