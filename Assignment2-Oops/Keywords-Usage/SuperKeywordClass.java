
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called: " + name);
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
        System.out.println("Dog constructor called: " + breed);
    }

    public void bark() {
        System.out.println(name + " the " + breed + " is barking!");
    }
}

public class SuperKeywordClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bunty", "German Shepard");
        dog1.eat();  
        dog1.bark(); 
    }
}
