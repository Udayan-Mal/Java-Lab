// 8. Write a Java program to implement hierarchical inheritance.

// Parent class
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
    
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class 1
class Dog extends Animal {
    // Method in the child class 1
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    // Method in the child class 2
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Calling methods from the parent class and the child classes
        System.out.println("Dog:");
        dog.eat();  // Inherited from Animal
        dog.sleep();  // Inherited from Animal
        dog.bark();  // Defined in Dog class

        System.out.println("\nCat:");
        cat.eat();  // Inherited from Animal
        cat.sleep();  // Inherited from Animal
        cat.meow();  // Defined in Cat class
    }
}
