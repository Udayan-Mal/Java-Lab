// 13. Create a class Student with attributes roll no, name, age and course. 
// Initialize values through parameterized constructor. 
// If age of student is not in between 15 and 21 then generate user-defined exception "AgeNotWithinRangeException". 
// If name contains numbers or special symbols raise exception "NameNotValidException". 
// Define the two exception classes.

// User-defined exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User-defined exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    // Attributes of the Student class
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized constructor to initialize student details
    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        // Check if the age is within valid range (15-21)
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }

        // Check if the name is valid (does not contain numbers or special symbols)
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name must contain only alphabets and spaces.");
        }
    }

    // Method to display student information
    void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main13 {
    public static void main(String[] args) {
        try {
            // Creating student objects and initializing details
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            student1.displayStudentInfo();

            Student student2 = new Student(2, "Alice123", 22, "Mathematics"); // This will throw exception for invalid name
            student2.displayStudentInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
