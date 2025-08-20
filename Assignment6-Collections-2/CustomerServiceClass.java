import java.util.*;

public class CustomerServiceClass {

    Queue<String> que = new LinkedList<>();

    public void add(String name){
        que.add(name);
        System.out.println(name+" added to the Queue.");
    }
    
    public void serve(){
        String served = que.poll();
        System.out.println("Served to "+served);
    }

    public void peekCustomer(){
        String peekedCustomer = que.peek();
        System.out.println("Next Customer is "+peekedCustomer);
    }
    public static void main(String[] args) {
        CustomerServiceClass customerObject = new CustomerServiceClass();
        customerObject.add("Dileep");
        customerObject.add("Naveen");
        customerObject.serve();
        customerObject.add("Mahesh");
        customerObject.peekCustomer();
        customerObject.serve();
        customerObject.peekCustomer();
    }
}
