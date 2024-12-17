// 6. Write a program to demonstrate the chained exception in Java.

public class ChainedExceptionDemo {

    // Method that throws an exception, which will cause another exception
    public static void causeException() throws Exception {
        try {
            // Throwing the first exception
            throw new ArithmeticException("ArithmeticException occurred!");
        } catch (ArithmeticException e) {
            // Throwing another exception while chaining the original exception
            throw new Exception("Exception occurred in causeException method", e);
        }
    }

    public static void main(String[] args) {
        try {
            causeException();  // Calling the method that throws the chained exception
        } catch (Exception e) {
            // Catching the chained exception
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());  // Accessing the cause of the exception
        }
    }
}
