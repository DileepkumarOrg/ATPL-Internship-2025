import java.util.Scanner;

public class StringsSafe {
    public void encrypts(){

    }
    
    public static String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String originalPassword = sc.nextLine();

        String encryptedPassword = encryptPassword(originalPassword);

        System.out.println("Original password: " + originalPassword);
        System.out.println("Encrypted password: " + encryptedPassword);

        sc.close();
    }
}


