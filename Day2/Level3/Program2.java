import java.util.Scanner;

class Book{

    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN,String title,String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void displayDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book{

    public EBook(int ISBN, String title, String author) {
        super(ISBN, title, author); 
    }

    public void displayEbookDetails(){
        System.out.println("\nEBook Details : ");
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + getAuthor());
    }
}

public class Program2{
    public static void main(String[] args){
        Book b1 = new Book(4567890, "Java Programming", "James Gosling");
        b1.displayDetails();

        EBook e1 = new EBook(87654321, "Effective Java", "Joshua Bloch");
        e1.displayEbookDetails();

        e1.setAuthor("James");
        System.out.print("\nUpdated Author : " + e1.getAuthor());
    }
}