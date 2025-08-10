public class Vehicle {
    public void fuel(){
        System.out.println("Fuel is low");
    }
    public void start(){
        System.out.println("Vehicle is Started");
    }
    
}
class Bike extends Vehicle {
    public void start(){
        System.out.println("Bike is Started");
    }
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.fuel();
        obj.start();
        
    }
}


class Car extends Vehicle {
    public void start(){
        System.out.println("Car is Started");
    }
    public static void main(String[] args){
        Car obj = new Car();
        obj.fuel();
        obj.start();
    }
    
}


