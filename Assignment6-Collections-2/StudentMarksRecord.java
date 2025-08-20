import java.util.Collections;
import java.util.HashMap;

public class StudentMarksRecord {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Hemanth", 90);
        studentMarks.put("Sandeep", 50);
        studentMarks.put("Amith", 68);
        studentMarks.put("Advik", 98);
        studentMarks.put("Eswanth", 88);
        System.out.println(studentMarks+"\n");
        int maxMarks = Collections.max(studentMarks.values());
        int minMarks = Collections.min(studentMarks.values());
        for (String name : studentMarks.keySet()) {
            if (studentMarks.get(name) == maxMarks) {
                System.out.print("Top Scorer: ");
                System.out.println(name + " "+ maxMarks);
            }
            else if (studentMarks.get(name) == minMarks) {
                System.out.print("Low Scorer : ");
                System.out.println(name +" "+minMarks);
            }
        }
    }
}
