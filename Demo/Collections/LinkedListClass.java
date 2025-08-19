import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList <String> al = new LinkedList<String>();
        al.add("String");
        al.add("lidgku");
        al.addFirst("iughiu");
        al.addLast("fobhwsfiu");
        
        System.out.println(al);
        try{
            System.out.println(al.remove(6));
        } catch(Exception e){
            System.out.println(e);
        }
        Queue<Integer> obj = new ArrayDeque<>();
        obj.add(5);
        obj.offer(6);
        obj.poll();
        obj.peek();
        obj.remove();
        System.out.println(obj);
    }
}
