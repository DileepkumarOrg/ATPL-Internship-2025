import java.util.Scanner;
public class Login2 {
    public static void login(String name, String password){
        if (name.equals("admin") && password.equals("password")){
            System.out.println("Login Successfully");
        }
        else{
            throw new LoginFailedException("** Login Failed or Invalid Credentials..! **");
        }
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter username : ");
        String inputUsername = scannerObj.nextLine();
        System.out.println("Enter Password : ");
        String inputPassword = scannerObj.nextLine();
        scannerObj.close();
        try{
            login(inputUsername,inputPassword);
        }
        catch(LoginFailedException e){
            System.out.println(e);
        }
    }
}

class LoginFailedException extends RuntimeException {
    public LoginFailedException(String message) {
        super(message);
    }
}
