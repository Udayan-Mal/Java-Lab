// 15. Write a program in java to create a nested try-catch block, where you have to display two different types of exception

public class NestedTryCatchExample {

    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started.");

            try {
                // Inner try block
                System.out.println("Inner try block started.");
                
                // Generate ArithmeticException (divide by zero)
                int result = 10 / 0;
                
            } catch (ArithmeticException e) {
                // Handling ArithmeticException
                System.out.println("Exception caught in inner catch block: " + e);
            }

            try {
                // Another inner try block
                System.out.println("Another inner try block started.");

                // Generate NumberFormatException (invalid number format)
                int number = Integer.parseInt("abc");
                
            } catch (NumberFormatException e) {
                // Handling NumberFormatException
                System.out.println("Exception caught in another inner catch block: " + e);
            }

        } catch (Exception e) {
            // Outer catch block to handle other exceptions
            System.out.println("Exception caught in outer catch block: " + e);
        }

        System.out.println("Outer try-catch block finished.");
    }
}
