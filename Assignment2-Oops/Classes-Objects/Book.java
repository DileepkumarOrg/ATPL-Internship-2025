public class Book {
    String title;
    String author;
    int price ;
    int discount;
    float discountPrice;
    Book(String title, String author, int price, int discount){
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
        discountPrice = discountMethod(price, discount);
        displayBookDetails(title,author,price,discount,discountPrice);
    }
    public float discountMethod(int price, int discount){
        return price-(price*discount/100);
    }
    public void displayBookDetails(String title,String author,int price,int discount,float discountPrice){
        System.out.println("Book Title : "+title+"\nAuthor : "+author+"\nMRP : "+price+"\nDiscount :"+discount+"%"+"\nFinal Price : "+discountPrice);
    }
    public static void main(String[] args) {
        Book java1 = new Book("The Complete Reference ","Herbert Schildt",1500,25);
        Book java2 = new Book("Java: A Beginner's Guide","Herbert Schildt",2900,20);
        Book java3 = new Book("Head First Java: A Brain-Friendly Guide, Third Edition","SierraKathy",3400,15);
    }
}
