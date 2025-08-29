public class HondaCar{

    /* public void start(){
        System.out.println("Car is started..");
    } */
    public static void main(String[] args) {
        /* HondaCar hc = new HondaCar();
        hc.start();
        hc.petrol();
        Car.speed(); */


        Car c = () -> "Car is started";
        System.out.println(c.start());
        Car.speed();
        c.petrol();


    }
    
}
