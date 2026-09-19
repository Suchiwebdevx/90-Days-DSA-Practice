package OOps;

public class BookStore {

    String title;
    String author;
    boolean isAvailable;

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    void borrowBook() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    public static void main(String[] args) {

        BookStore b = new BookStore();

        b.title = "Java Programming";
        b.author = "James";
        b.isAvailable = true;

        b.displayBook();

        b.borrowBook();

        System.out.println("Available after borrowing: " + b.isAvailable);
    }
}