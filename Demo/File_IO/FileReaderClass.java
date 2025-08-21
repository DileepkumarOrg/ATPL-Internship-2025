import java.io.*;

public class FileReaderClass {
    public static void main(String[] args) {
        File file = new File("Sample.txt");
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write("Hello World");
            fw.close();
            FileReader fr = new FileReader(file);
            int ch;
            while ((ch=fr.read()) != -1) {
                System.out.print((char)ch);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
