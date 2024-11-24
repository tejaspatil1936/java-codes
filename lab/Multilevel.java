// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Derived class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // inherited from Animal
        dog.walk();  // inherited from Mammal
        dog.bark();  // method in Dog class
    }
}