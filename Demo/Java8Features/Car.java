@FunctionalInterface
public interface Car {
    public String start();

    default void petrol(){
        System.out.println("Petroling..");
    }

    static void speed(){
        System.out.println("Speed is 100");
    }
}
