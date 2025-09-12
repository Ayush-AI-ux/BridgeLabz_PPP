public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book1 -> " + book1.getTitle() + " by " + book1.getAuthor() + ", Price: " + book1.getPrice());

        Book book2 = new Book("Effective Java", "Joshua Bloch", 550.0);
        System.out.println("Book2 -> " + book2.getTitle() + " by " + book2.getAuthor() + ", Price: " + book2.getPrice());
    }
}


class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}
