class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
        super.sound();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
