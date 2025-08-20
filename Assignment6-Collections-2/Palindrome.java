import java.util.*;

public class Palindrome {
    public boolean palindromeMethod(String name){
        Deque<Character> queueSCharacters = new ArrayDeque<>();
        for(int index = 0 ;index < name.length(); index++){
            queueSCharacters.add(name.charAt(index));
        }

        for(int j = 0; j < name.length()/2; j++){
            if (queueSCharacters.getFirst() != queueSCharacters.getLast()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome palindromeObjective = new Palindrome();
        Scanner scannerObjeect = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String name = scannerObjeect.nextLine();
        scannerObjeect.close();
        System.out.println(palindromeObjective.palindromeMethod(name) ? name + " is a Palindrome" : name + " is not a Palindrome");
    }
}
