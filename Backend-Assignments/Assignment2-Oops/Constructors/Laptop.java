public class Laptop {
    String brand;
    int ram;
    String processor;
    String gaming;
    Laptop(String brand, int ram , String processor){
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        System.out.println("Brand : "+brand+"\nRam : "+ram+"GB\nProcessor : "+processor+" hours");
    }
    public static void main(String[] args) {
        Laptop hp = new ("HP",16,"I7");
        Laptop dell = new ("DELL",16,"I7");
    }
}
