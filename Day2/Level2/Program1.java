import java.util.Scanner;

class Product {

    String productName;
    double price;

    static int totalProducts = 0;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;  
    }
    
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products : " + totalProducts);
    }
}

public class Program1 {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Smartphone", 800.00);

        System.out.println("\nProduct 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
} 