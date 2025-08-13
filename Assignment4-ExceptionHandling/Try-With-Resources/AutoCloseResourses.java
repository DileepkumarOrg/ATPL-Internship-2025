import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AutoCloseResourses {
    public static void readFileSafely(File file){
        try(
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            
        ){
            String line ;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        File file = new File("Assignment4-ExceptionHandling\\Try-With-Resources\\sample.txt");
        readFileSafely(file);
    }
}
