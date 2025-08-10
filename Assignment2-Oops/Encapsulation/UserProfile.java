
public class UserProfile {
    private String username;
    private String email;
    private String password;
    public String emailValidate = "@";
    public void setUsername(String username){
        if (username.length()>5) {
            this.username = username;
        }
        else{
            System.err.println("username need atleast 5 character");
        }
    }
    public void getUsername(){
        System.out.println(username);
    }
    public void setEmial(String email){
        if (email.contains(emailValidate)) {
            this.email = email;
        }
        else{
            System.err.println("Email not found ");
        }
    }
    public void getEmail(){
        System.out.println(email);
    }
    public void setPassword(String password){
           if (password.length()>6) {
                this.password = password;
        }
        else{
            System.err.println("password need atleast 6 character");
        }
    }
    public void getPassword(){
        System.out.println(password);
    }
}
class User extends UserProfile{
    public static void main(String[] args) {
        User userObj = new User();
        userObj.setUsername("dileep47");
        userObj.getUsername();
        userObj.setEmial("dileepkumar1414@gmail.com");
        userObj.getEmail();
        userObj.setPassword("Dileep@123");
        userObj.getPassword();

        //userObj.username;        We can't access this is Private Variable
        //userObj.emial;
        //userObj.password;
    }
    
}