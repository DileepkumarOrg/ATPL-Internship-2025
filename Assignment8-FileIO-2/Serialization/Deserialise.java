import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.MessageFormat;

public class Deserialise {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("Assignment8-FileIO-2\\Serialization\\students.ser");
            ObjectInputStream obj = new ObjectInputStream(fi);

            Student s = (Student) obj.readObject();
            String message = MessageFormat.format("Id: {0} , Name : {1} , Age :  {2} , GPA : {3}",s.id, s.name, s.age, s.department, s.gpa);
            System.out.println(message);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}