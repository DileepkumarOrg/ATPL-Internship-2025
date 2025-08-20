import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
    public static void main(String[] args) {
        Set<Integer> integerList = new HashSet<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(6);
        integerList.add(2);
        System.out.println(integerList);
    }
}
