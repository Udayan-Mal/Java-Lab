// 7. Write a program in Java to show the examples of i)call by value and ii) call by reference.

// i) Call by Value (Primitive Type)

public class CallByValueExample {

    // Method to demonstrate call by value
    public static void modifyValue(int x) {
        x = 10;  // Modifies the local copy of 'x'
        System.out.println("Value inside modifyValue: " + x);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Original value: " + number);
        
        modifyValue(number);  // Passes a copy of 'number' to the method
        
        System.out.println("Value after modifyValue: " + number);  // Original value remains unchanged
    }
}
