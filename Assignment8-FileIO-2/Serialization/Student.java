import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    int id;
    String name;
    int age;
    String department;
    double gpa;

    Student(int id, String name, int age, String depatrmnent, double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = depatrmnent;
        this.gpa = gpa;
    }


    public static void main(String[] args) {
        try {
            Student s1 = new Student(1,"Dileep",21,"ECE",8.8);            
            FileOutputStream fs = new FileOutputStream("Assignment8-FileIO-2\\Serialization\\students.ser");
            ObjectOutputStream writer = new ObjectOutputStream(fs);
            writer.writeObject(s1);
            fs.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}