// 11. Write a program in Java to override a base class method into a derived class.

// Base class
class Animal {
    // Method in the base class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the sound method in the derived class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method in the derived class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat, which are subclasses of Animal
        Animal myDog = new Dog();  // Creating an object of Dog class
        Animal myCat = new Cat();  // Creating an object of Cat class

        // Calling overridden methods
        myDog.sound();  // Calls Dog's version of sound()
        myCat.sound();  // Calls Cat's version of sound()
    }
}
