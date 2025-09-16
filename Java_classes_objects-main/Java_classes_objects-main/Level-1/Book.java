public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "Ajay Kumar", 499.99);
        b.displayDetails();
    }
}
