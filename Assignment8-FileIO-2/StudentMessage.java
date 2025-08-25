import java.util.ArrayList;
import java.util.Arrays;
import java.text.MessageFormat;  

public class StudentMessage {
    ArrayList<String> nameList = new ArrayList<>(
        Arrays.asList("Dileep", "Naveen", "Mahesh"));
    ArrayList<String> departmentList = new ArrayList<>(
        Arrays.asList("ECE", "ECE", "CSE"));
    ArrayList<Float> gpaList = new ArrayList<>(
        Arrays.asList(8.8f, 9f, 9f));

    public static void main(String[] args) {
        StudentMessage studentDetails = new StudentMessage();
        
        for (int index = 0; index < studentDetails.nameList.size(); index++) {
            String message = MessageFormat.format(
                "Student {0} from {1} department has secured a GPA of {2}",
                studentDetails.nameList.get(index),
                studentDetails.departmentList.get(index),
                studentDetails.gpaList.get(index)
            );

            System.out.println(message);
        }
    }
}
