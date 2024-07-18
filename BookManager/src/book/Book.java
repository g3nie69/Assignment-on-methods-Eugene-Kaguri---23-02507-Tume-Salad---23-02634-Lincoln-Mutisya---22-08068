package book;

public class Book {

    private final String title;
    private final String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Non-static method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Static method to calculate the total number of books
    private static int totalBooks = 0;

    public static void addBook() {
        totalBooks++;
    }

    // Static method to display the total number of books
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }

    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book("Java Programming", "Joe Keymots");
        Book book2 = new Book("Python Basics", "Tunde Salad");
        Book book3 = new Book("Anguka Nayo Foundations", "Lincoln Mutisya");

        // Add books to calculate the total
        Book.addBook();
        Book.addBook();

        // Display details of each book
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
        System.out.println();

        // Display total number of books
        Book.displayTotalBooks();
    }
}
