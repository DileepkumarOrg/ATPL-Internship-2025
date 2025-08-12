public class Interning {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = a.intern();
        String c= "Hello";
        System.out.println("a == b : "+(a == b));
        System.out.println("a == c : "+(a == c));
        System.out.println("b == c : "+(b == c));
    }
}

/*
 * intern() method is used to manage memory efficiently by ensuring the same memory locations for same string literals .
 */
