public interface Movable {

    public void move();
}

class Car implements Movable{
    @Override
    public void move(){
        System.out.println("Car is Moving..");
    }
}

class Robot implements Movable{
    @Override
    public void move(){
        System.out.println("Robot is Moving");
    }
}

class Drone implements Movable{
    @Override
    public void move(){
        System.out.println("Drone is flying");
    }
}

class User{
    public static void main(String[] args) {
        Car carObj = new Car();
        Robot robotObj = new Robot();
        Drone droneObj = new Drone();
        carObj.move();
        robotObj.move();
        droneObj.move();
    }
}

