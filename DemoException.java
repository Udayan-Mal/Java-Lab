// 4. Write a program in Java to implement throws and throws exception

class DemoException {

    // Method that throws an exception
    public static void checkNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Number cannot be negative!"); // Throwing an exception
        } else {
            System.out.println("Number is: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(10);  // Valid input
            checkNumber(-5);  // Will throw an exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

