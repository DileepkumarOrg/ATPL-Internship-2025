import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String word = scannerObject.nextLine();
        scannerObject.close();
        ArrayList<Character> charactersArray = new ArrayList<>();
        for(int index = 0; index < word.length(); index++){
            charactersArray.add(word.charAt(index));
        }
        TreeSet<Character> characterSet = new TreeSet<>(charactersArray);
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (Character character : characterSet) {
            int count = 0;
           for (Character character2 : charactersArray) {
                if (character == character2) {
                    count++;
                }
           }
           frequency.put(character,count);
        }
        System.out.println("Characterfrequency is "+frequency);
    }
}
