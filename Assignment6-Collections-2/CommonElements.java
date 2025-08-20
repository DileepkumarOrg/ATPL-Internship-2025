import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public void union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new TreeSet<>(set1);
        resultSet.addAll(set2);
        System.out.println(resultSet);
    }

    public void intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new TreeSet<>(set1);
        resultSet.retainAll(set2);
        System.out.println(resultSet);
    }

    public void difference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new TreeSet<>(set1);
        resultSet.removeAll(set2);
        System.out.println(resultSet);
    }

    public static void main(String[] args) {
        CommonElements ce = new CommonElements();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Set1 : ");
        int set1Length = scannerObject.nextInt();
        for(int i= 0; i<set1Length; i++){
            System.out.printf("Enter set1[%d] : ",i);
            int num = scannerObject.nextInt();
            set1.add(num);
        }
        System.out.println("Enter Number of Elements in Set2 : ");
        int set2Length = scannerObject.nextInt();
        for(int i= 0; i<set2Length; i++){
            System.out.printf("Enter set2[%d] : ",i);
            int num = scannerObject.nextInt();
            set2.add(num);
        }
        scannerObject.close();
        ce.union(set1,set2);
        ce.intersection(set1,set2);
        ce.difference(set1,set2);
    }
}
