import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

    public static void scanFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        }
    }

    public static void main(String[] args) {
        scanFile("Assignment4-ExceptionHandling\\Try-With-Resources\\sample.txt");
    }
}
