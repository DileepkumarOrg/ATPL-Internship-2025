public class Final {
    final void method(){
        System.out.println("Final Method is called");
    }
}

class Child extends Final {
    /* @Override
    void method(){
        System.out.println("Final Method Override...");
    } */

    public static void main(String[] args) {
        Child obj = new Child();
        obj.method();
    }
}
