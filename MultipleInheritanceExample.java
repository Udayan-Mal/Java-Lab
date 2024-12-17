// 9. Write a program in Java to show the application of multiple inheritance.

// Interface 1
interface Animal {
    void eat();  // Method in Animal interface
}

// Interface 2
interface Pet {
    void play();  // Method in Pet interface
}

// Class that implements both interfaces
class Dog implements Animal, Pet {
    // Implementing the method from Animal interface
    public void eat() {
        System.out.println("The dog eats food.");
    }

    // Implementing the method from Pet interface
    public void play() {
        System.out.println("The dog plays fetch.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Creating an object of Dog class

        // Calling methods from both interfaces
        dog.eat();  // From Animal interface
        dog.play(); // From Pet interface
    }
}
