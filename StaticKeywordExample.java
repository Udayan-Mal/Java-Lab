// 10. Write a program in Java to show the application of the ‘static’ keyword in Java.

class StaticExample {

    // Static variable
    static int count = 0;

    // Static method
    static void incrementCount() {
        count++;  // Modifies the static variable count
    }

    // Instance method
    void displayCount() {
        System.out.println("Count value: " + count);
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        System.out.println("Initial count: " + StaticExample.count);  // Directly accessing static variable
        StaticExample.incrementCount();  // Calling static method
        StaticExample.incrementCount();
        
        // Creating object to call instance method
        StaticExample obj = new StaticExample();
        obj.displayCount();  // This will display the count value
    }
}
