import java.util.*;

abstract class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void loanBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("Book is already loaned.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    public void checkAvailability() {
        System.out.println("Is the book available? " + (isAvailable ? "Yes" : "No"));
    }

    public abstract double calculateLateFees(int daysLate);
}

interface Loanable {
    void loanBook();
    void returnBook();
}

class FictionBook extends Book {
    private static final double DAILY_LATE_FEE = 2.0;

    public FictionBook(String bookId, String title, String author) {
        super(bookId, title, author);
    }

    @Override
    public double calculateLateFees(int daysLate) {
        return DAILY_LATE_FEE * daysLate;
    }
}

class NonFictionBook extends Book {
    private static final double DAILY_LATE_FEE = 1.5;

    public NonFictionBook(String bookId, String title, String author) {
        super(bookId, title, author);
    }

    @Override
    public double calculateLateFees(int daysLate) {
        return DAILY_LATE_FEE * daysLate;
    }
}

public class Program4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        FictionBook fictionBook = new FictionBook("F123", "The Great Adventure", "John Doe");
        NonFictionBook nonFictionBook = new NonFictionBook("NF456", "The Art of Science", "Jane Smith");

        books.add(fictionBook);
        books.add(nonFictionBook);

        fictionBook.checkAvailability();
        nonFictionBook.checkAvailability();

        fictionBook.loanBook();
        nonFictionBook.loanBook();

        fictionBook.checkAvailability();
        nonFictionBook.checkAvailability();

        fictionBook.returnBook();
        nonFictionBook.returnBook();

        fictionBook.checkAvailability();
        nonFictionBook.checkAvailability();

        for (Book book : books) {
            System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            int daysLate = 3; // Example of 3 days late
            System.out.println("Late Fee for " + daysLate + " days: " + book.calculateLateFees(daysLate));
            System.out.println("----------");
        }
    }
}
