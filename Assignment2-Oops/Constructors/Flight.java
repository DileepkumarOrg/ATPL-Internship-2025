public class Flight {
    int flightNumber ;
    String destination;
    double duration;

    Flight(int flightNumber , String destination, double duration){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.duration = duration;
        System.out.println("Flight Number : "+flightNumber+"\nDestination : "+destination+"\nDuration : "+duration+" hours");
    }
   Flight(){
        
   }
    public static void main(String[] args) {
        Flight flightHyderabad = new Flight(5214,"Hyderabad",2.5);
        System.out.println("");
        Flight vizaFlight = new Flight();
        vizaFlight.flightNumber = 3542;
        vizaFlight.destination = "Visakhapatnam";
        vizaFlight.duration = 3;
        System.out.println("Flight Number : "+vizaFlight.flightNumber+"\nDestination : "+vizaFlight.destination+"\nDuration : "+vizaFlight.duration+" hours");
    }
}
