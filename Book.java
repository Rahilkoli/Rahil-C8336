package Lab6Q1;
import java.util.ArrayList;
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;


    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }


    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }

}

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book(1, "flamingo", "Alphonse Daudet"));
        books.add(new Book(2, "Harry Potter and the Sorcerer's Stone", "j.k rowling"));
        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));


        for (Book book : books) {
            System.out.println(book);
        }
    }
}