import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Demo\\File_IO\\text.txt"));
            pw.write("Hello Hii");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
