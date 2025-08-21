package Demo.File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            fos.write("Dileep".getBytes());
            fos.close();
            FileInputStream fis = new FileInputStream(file);
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
