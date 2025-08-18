import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 
        list.add(50);
        list.addFirst(5);
        list.addLast(60);
        list.remove(2); 
        System.out.println(list); 
    }
}
