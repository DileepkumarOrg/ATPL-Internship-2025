import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = scannerObject.nextLine();
        scannerObject.close();
        String[] wordArray = sentence.split(" ");
        TreeSet<String> wordSet = new TreeSet<>();
        wordSet.addAll(Arrays.asList(wordArray));
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : wordSet) {
            int count = 0;
           for (String word2 : wordArray) {
                if (word.equals(word2)) {
                    count++;
                }
           }
           frequency.put(word,count);
        }
        System.out.println("Wordfrequency is "+frequency);
    }
}
