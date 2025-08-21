import java.io.*;
import java.util.*;

public class FileReaderClass {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        StringBuilder data = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("Assignment7-FileIO-1\\Task-1\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] arr = data.toString().split(" "); 

        for (String word : arr) {
            if (!word.isEmpty()) {
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Assignment7-FileIO-1\\Task-1\\word_frequencies.txt"))) {
            for (Map.Entry<String, Integer> entry : list) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
            System.out.println("Word frequencies written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
