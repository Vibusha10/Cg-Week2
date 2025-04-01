import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyCost;

    public Electronics(int productId, String name, double price, double warrantyCost) {
        super(productId, name, price);
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    @Override
    public double calculateTax() {
        return (getPrice() + warrantyCost) * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%)";
    }
}

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (12%)";
    }
}

class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class Program2 {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        Product p1 = new Electronics(201, "Laptop", 80000, 5000);
        Product p2 = new Clothing(202, "Jacket", 3000, "L");
        Product p3 = new Groceries(203, "Apples", 500, "2025-05-01");

        cart.add(p1);
        cart.add(p2);
        cart.add(p3);

        for (Product p : cart) {
            p.displayDetails();
            double tax = 0;
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails() + ": " + tax);
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------");
        }
    }
}