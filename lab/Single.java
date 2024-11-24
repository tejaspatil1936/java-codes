
// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // inherited method
        dog.bark();  // method in Dog class
    }
}