import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandleCheckedExceptions {

    public void loadFile(File f) {
        try  {
            FileInputStream fis = new FileInputStream(f);
            fis.close();
        } 
        catch (FileNotFoundException fe){
            System.out.println(fe);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        HandleCheckedExceptions object = new HandleCheckedExceptions();
        File f = new File("Dileep.txt");
        object.loadFile(f);
    }
}


