// 17. Write a Java program to implement a copy constructor to create a new object by copying another object's state.

class Student {
    int rollNo;
    String name;

    // Parameterized constructor to initialize an object
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy constructor to copy attributes of another object
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
    }

    // Method to display the student details
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Student student1 = new Student(101, "Alice");
        
        // Create a new object using the copy constructor
        Student student2 = new Student(student1);
        
        // Display both objects to verify they have the same state
        System.out.println("Original Object (student1):");
        student1.display();
        
        System.out.println("Copied Object (student2):");
        student2.display();
    }
}
