import java.util.Scanner;

class Book{

    String title;
    String author;
    int price;

    public Book(){
        this.title = "Alice";
        this.author = "James";
        this.price = 600;
    }

    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class Program1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Book bookDetails1 = new Book();
        bookDetails1.displayDetails();

        System.out.print("\nEnter the title : ");
        String title = input.nextLine();

        System.out.print("Enter the author : ");
        String author = input.nextLine();

        System.out.print("Enter the price : ");
        int price = input.nextInt();

        Book bookDetails2 = new Book(title,author,price);
        bookDetails2.displayDetails();
    }
}