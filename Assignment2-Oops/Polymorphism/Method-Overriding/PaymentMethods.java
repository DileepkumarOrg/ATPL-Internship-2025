class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing payment " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment " + amount);
    }
}

public class PaymentMethods {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(); 
        Payment p2 = new UPIPayment();
        p1.processPayment(1500);
        p2.processPayment(800);
    }
}

