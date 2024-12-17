// 12. Write a Program in Java to call a super class constructor from sub/child class.

// Superclass
class Animal {
    // Constructor of the superclass
    Animal(String name) {
        System.out.println("Animal's name: " + name);
    }
}

// Subclass
class Dog extends Animal {
    // Constructor of the subclass that calls the superclass constructor
    Dog(String name) {
        // Calling the superclass constructor using super()
        super(name);
        System.out.println("Dog's name: " + name);
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        // Creating an object of the Dog class, which calls the superclass constructor
        Dog dog = new Dog("Buddy");
    }
}
