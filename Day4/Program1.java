import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            book.displayInfo();
        }
        System.out.println();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library cityLibrary = new Library("City");
        Library schoolLibrary = new Library("School");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);

        cityLibrary.displayBooks();
        schoolLibrary.displayBooks();
    }
}
