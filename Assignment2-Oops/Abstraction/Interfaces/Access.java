
interface Printable {
    void print(); 
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the Document...");
    }
}

class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the Image...");
    }
}

class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the Invoice...");
    }
}

public class Access {
    public static void main(String[] args) {
        
        Printable documentObj = new Document();
        Printable imgageObj = new Image();
        Printable invoiceObj = new Invoice();
        
        documentObj.print();
        imgageObj.print();
        invoiceObj.print();
    }
}
