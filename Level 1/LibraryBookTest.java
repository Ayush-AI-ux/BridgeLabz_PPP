public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Clean Code", 450.0);

        System.out.println("\nLibraryBook '" + lb.getTitle() + "' available? " 
                           + lb.isAvailable() + " | Book Price: " + lb.getPrice());

        lb.borrowBook();

        System.out.println("After borrowing, available? " + lb.isAvailable());
    }
}

class LibraryBook {
    private String title;
    private double price;
    private boolean available;

    public LibraryBook(String title, double price) {
        this.title = title;
        this.price = price;
        this.available = true; 
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public boolean isAvailable() { return available; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
}
