package Demo.Collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>();
        al.add("String");
        al.add("lidgku");
        try{
            al.forEach(null);
        }catch (Exception e){
            System.out.println(e);
        }
        
        System.out.println(al);
        try{
            System.out.println(al.remove(6));
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
