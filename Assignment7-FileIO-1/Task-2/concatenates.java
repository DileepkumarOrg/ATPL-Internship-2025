import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class concatenates {

    public static void main(String[] args)  {
        File file = new File("Assignment7-FileIO-1\\Task-2\\MergingFile.txt");
        File  file1 = new File("Assignment7-FileIO-1\\Task-2\\file1.txt");
        File  file2 = new File("Assignment7-FileIO-1\\Task-2\\file2.txt");
        String mergedData= "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file1));
            int ch;
            while ((ch = br.read())!=-1) {
                mergedData += (char)ch;
            }
            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(file2));
            int ch;
            while ((ch = br.read())!=-1) {
                mergedData += (char)ch;
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(mergedData);
            bw.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
