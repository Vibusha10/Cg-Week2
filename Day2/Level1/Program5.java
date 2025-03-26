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

    public Book(Book other){
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public void displayDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book bookDetails1 = new Book();
        bookDetails1.displayDetails();

        System.out.println("\nBorrowing details");

        Book bookDetails2 = new Book(bookDetails1);
        bookDetails2.displayDetails();
    }
}