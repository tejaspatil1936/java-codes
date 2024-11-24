// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Hierachical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound(); // inherited method from Animal
        dog.bark(); // method in Dog class

        cat.sound(); // inherited method from Animal
        cat.meow(); // method in Cat class
    }
}