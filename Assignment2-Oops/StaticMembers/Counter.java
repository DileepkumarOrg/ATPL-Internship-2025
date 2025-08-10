public class Counter {
    static int counter = 0;
    Counter(){
        counter++;
        System.out.println("Object Created, Object number :  "+counter);
    }

    public static void display(){
        System.out.println("Total number of objects : "+counter);
    }
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        display();
    }
}
