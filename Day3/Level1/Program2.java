import java.util.Scanner;

class Book{
    static String libraryName =  "Central";
    String title;
    String author;
    final int ISBN;

    public Book(String title,String author,final int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("Library Name : " + libraryName);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + ISBN);
    }
}

public class Program2{
    public static void main(String[] args){
        Book b1 = new Book("Java Programming", "James Gosling", 123456);
        b1.displayDetails();

        Book b2 = new Book("Clean Code", "Robert C. Martin", 654321);
        b2.displayDetails();

        System.out.println("\nIs it a instance : " + (b1 instanceof Book));
    }
}