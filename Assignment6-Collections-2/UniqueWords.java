import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a sentense : ");
        String sentense = scannerObj.nextLine();
        scannerObj.close();
        String[] wordsArray = sentense.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : wordsArray) {
            uniqueWords.add(word);
        }
        System.out.println("\nUnique Words from a Sentence\n"+uniqueWords);
    }
}