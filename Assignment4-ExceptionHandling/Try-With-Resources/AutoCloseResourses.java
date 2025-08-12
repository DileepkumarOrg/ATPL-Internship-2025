import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseResourses {
    public static void main(String[] args) throws  IOException {
        File file = new File("sample.txt");
        try(
            FileReader reader = new FileReader(file);
            
        ){

        }
    }
}
