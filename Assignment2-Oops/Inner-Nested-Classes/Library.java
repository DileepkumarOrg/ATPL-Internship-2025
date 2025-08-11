public class Library {
    public class  Book {
        public void bookMethod(){
            System.out.println("Book method is called..");
        }
        public String bookName = "Java";
        
    }

    public void accessBook(){
        Book bookObj = new Book();
        bookObj.bookMethod();
        System.out.println("Book Name : "+bookObj.bookName);

    }
    public static void main(String[] args) {
        Library libraryObj = new Library();
        libraryObj.accessBook();
    }
}
