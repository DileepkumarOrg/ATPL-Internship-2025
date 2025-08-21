import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DecriptClass {
    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Assignment7-FileIO-1\\Task-4\\encrypted.txt"));
            int ch;
            System.out.print("Decripted message : ");
            while ((ch=br.read())!=-1) {
                System.out.print((char)(ch-2));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

