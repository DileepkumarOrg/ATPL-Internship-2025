import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsClass {
    public static void readFile(String filename) throws IOException {
        BufferedReader bufferedReaderObject = new BufferedReader(new FileReader(filename));
        String line;
        
        while ((line = bufferedReaderObject.readLine()) != null) {
            System.out.println(line);
        }
        
        bufferedReaderObject.close();
    }

    public static void main(String[] args) {
        try {
            readFile("Assignment4-ExceptionHandling\\ThrowThrows\\Dileep.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
