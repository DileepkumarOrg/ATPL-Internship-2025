import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) throws IOException {
        
        PrintWriter pw = new PrintWriter(new FileWriter("Assignment8-FileIO-2\\Students.txt",true));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students : ");
        int number = scanner.nextInt();
        for (int index = 0; index < number; index++){
            System.out.printf("Enter %d Student Name: ",index+1);
            String name = scanner.next();
            System.out.printf("Enter %d Student Age: ",index+1);
            int age = scanner.nextInt();
            System.out.printf("Enter %d Student Department: ",index+1);
            String department = scanner.next();
            System.out.println("Enter %f Student GPA : ");
            Float gpa = scanner.nextFloat();
            
            pw.write(String.format("Student [ name = %-10s, age = %-4d,department = %-5s, gpa =  %.1f ]\n", name, age, department, gpa));
        }
        pw.close();
        
        scanner.close();
    }
}


// Output : Students.txt
/*
Student [ name = Dileep    , age = 21  ,department = ECE  , gpa =  8.8 ]
Student [ name = Naveen    , age = 22  ,department = ECE  , gpa =  9.0 ]
Student [ name = Mahesh    , age = 22  ,department = CSE  , gpa =  9.8 ]
Student [ name = Gnani     , age = 23  ,department = ECE  , gpa =  8.9 ]
Student [ name = Aaditya   , age = 21  ,department = CSE  , gpa =  9.0 ]

 */