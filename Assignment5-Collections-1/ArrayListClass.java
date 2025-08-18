import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dileep");
        list.add("Naveen");
        list.add("Mahesh");
        list.add("Sandeep");
        list.add("Hemanth");
        System.out.println("Using For Loop");
        for (int index = 0; index < list.size(); index++){
            System.out.print(list.get(index)+" ");
        }
        System.out.println();
        System.out.println("Using Enhanced For Loop");
        for(String index : list){
            System.out.print(index+" ");
        }
        System.out.println();
        list.remove(3);
        System.out.println("After Removing 3rd Element");
        System.out.println(list);
    }
}
