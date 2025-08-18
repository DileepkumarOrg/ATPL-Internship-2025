import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        vector.add(2.56);
        vector.add(3.654);
        vector.add(4.2365);
        vector.add(5.68);
        Enumeration<Double> enumeration  = vector.elements();
        while (enumeration.hasMoreElements()) {
            Double value = enumeration.nextElement();
            System.out.println(value);
        }
    }
}
