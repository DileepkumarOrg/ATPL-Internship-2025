import java.util.Scanner;

public class ReverseString {
    String inputFromUser;
    ReverseString(String inputFromUser){
        this.inputFromUser = inputFromUser;
    }

    public void reverseUsingFor(){
        String reversedString="";
        for (int index = inputFromUser.length(); index > 0; index--){
            reversedString += inputFromUser.charAt(index-1);
        }
        System.out.println("by using For Loop Reversed input :"+reversedString);
    }


    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter Input String : ");
        String inputFromUser = scannerObject.nextLine();
        scannerObject.close();
        ReverseString reverseObj = new ReverseString(inputFromUser);
        reverseObj.reverseUsingFor();

        StringBuffer stringBufferObj = new StringBuffer(inputFromUser);
        System.out.println("by using String Buffer reversed String : "+stringBufferObj.reverse());
        StringBuilder stringBuilderObj = new StringBuilder(inputFromUser);
        System.out.println("by using String builder reversed String : "+stringBuilderObj.reverse());
    }
}
