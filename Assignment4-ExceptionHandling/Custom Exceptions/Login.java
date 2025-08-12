import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        String userName = "admin";
        String password = "password";
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter username : ");
        String inputUsername = scannerObj.nextLine();
        System.out.println("Enter Password : ");
        String inputPassword = scannerObj.nextLine();
        scannerObj.close();
        if (userName.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("Login Successfully");
        }
        else{
            throw new LoginFailedException("** Login Failed or Invalid Credentials..! **");
        }
    }
}

class LoginFailedException extends RuntimeException {
    public LoginFailedException(String message) {
        super(message);
    }
}
