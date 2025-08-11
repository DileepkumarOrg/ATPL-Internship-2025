
public class Animal {
    public void makeSound(){
        System.out.println("Animal Sounds...!");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bow bow ...!");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow meow ...!");
    }
}

class Cow extends Animal{
    public void makeSound(){
        System.out.println("mooo mooo ...!");
    }
}

class AnimalsSounds{
    public static void main(String[] args) {
        Animal dogObj = new Dog();
        Animal catObj = new Cat();
        Animal cowObj = new Cow();
        dogObj.makeSound();
        catObj.makeSound();
        cowObj.makeSound();
    }
}