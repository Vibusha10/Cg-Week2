import java.util.Scanner;

class Book{

    String title;
    String author;
    int price;

    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price; 
    }

    public void displayDetails(){
        System.out.println("Book Details");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    } 
}

public class Program3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String bookTitle = input.nextLine();
        
        System.out.print("Enter Book Author: ");
        String bookAuthor = input.nextLine();

        System.out.print("Enter Book Price: ");
        int bookPrice = input.nextInt();

        Book bookRecord = new Book(bookTitle,bookAuthor, bookPrice);
        bookRecord.displayDetails(); 
    }
}