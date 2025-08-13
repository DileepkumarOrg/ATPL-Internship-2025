package Demo.Collections;


import java.util.LinkedList;

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
    }
}
