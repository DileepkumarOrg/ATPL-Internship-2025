
import java.util.ArrayList;
import java.util.Arrays;

public class StudentDetails {
    ArrayList<String> nameList = new ArrayList<>(
    Arrays.asList("Dileep", "Naveen", "Mahesh"));
    ArrayList<Integer> ageList = new ArrayList<>(
    Arrays.asList(21, 22, 23));
    ArrayList<String> departmentList = new ArrayList<>(
    Arrays.asList("ECE", "ECE", "CSE"));
    ArrayList<Float> gpaList = new ArrayList<>(
    Arrays.asList(8.8f, 9f, 9f));
    public static void main(String[] args){
        StudentDetails studentDetails = new StudentDetails();
        System.out.printf("%-10s %-4s %-12s   %s\n","Name","Age","Department","GPA");
        for(int index =0 ; index < studentDetails.nameList.size(); index++){
            System.out.printf("%-10s %-4d %-12s   %.1f\n",studentDetails.nameList.get(index),studentDetails.ageList.get(index),studentDetails.departmentList.get(index),studentDetails.gpaList.get(index));
        }
    }
}
//Output :
/*
    Name       Age  Department     GPA
    Dileep     21   ECE            8.8
    Naveen     22   ECE            9.0
    Mahesh     23   CSE            9.0
 */