class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Animal dog = new Dog(); // Polymorphism
        dog.makeSound();
    }
}
