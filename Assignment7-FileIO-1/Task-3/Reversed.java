import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reversed {
    public static void main(String[] args) {
        try{
            BufferedReader br =  new BufferedReader(new FileReader("Assignment7-FileIO-1\\Task-3\\input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Assignment7-FileIO-1\\Task-3\\Reversed.txt"));
            String word ="";
            while ((word = br.readLine())!= null) {
                bw.write(new StringBuilder(word).reverse().toString());
                bw.newLine();
            }
            br.close();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
