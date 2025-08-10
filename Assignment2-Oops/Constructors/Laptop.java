public class Laptop {
    String brand;
    int ram;
    String processor;
    boolean gamminng;
    Laptop(String brand, int ram , String processor){
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        System.out.println("Brand : "+brand+"\nRam : "+ram+"GB\nProcessor : "+processor+" hours");
    }
    Laptop(String brand, int ram , String processor, Boolean gamminng){
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.gamminng = true;
        System.out.println("Brand : "+brand+"\nRam : "+ram+"GB\nProcessor : "+processor+" hours\nGamming : "+gamminng);
    }
    public static void main(String[] args) {
        System.out.println("HP Laptop ");
        Laptop hp = new Laptop("HP",16,"I7");
        System.out.println("\nDell Laptop");
        Laptop dell = new Laptop("DELL",16,"I7",true);
    }
}
