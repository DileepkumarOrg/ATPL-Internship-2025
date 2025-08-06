public class Book {
    public String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Final Price: = %.2f\n", price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args){
        Book book1 = new Book("Effective Java", "Joshua Bloch", 45.00);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 50.00);
        Book book3 = new Book("Design Patterns", "Erich Gamma", 60.00);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        book1.applyDiscount(10);
        book2.applyDiscount(15);
        book3.applyDiscount(20);

        System.out.println("After applying discounts:");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails(); 
    }
}



