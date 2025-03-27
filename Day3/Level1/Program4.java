class Product {
    static double discount = 5.0;
    static int nextID = 1;

    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = nextID++;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount);
    }

    public void displayDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product ID   : " + productID);
        System.out.println("Name         : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discount);
        System.out.println("Total Price  : " + calculateTotalPrice());
    }

    public double calculateTotalPrice() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.0, 2);
        Product p2 = new Product("Headphones", 200.0, 3);

        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        Product.updateDiscount(10.0);

        System.out.println("\n--- After Discount Update ---");

        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }
    }
}
