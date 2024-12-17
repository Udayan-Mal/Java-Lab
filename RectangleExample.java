// 18. Create a class Rectangle with data members length, breadth and height. 
// Use a parameterised constructor to initialize the object. 
// With the help of function surface area() and volume(), 
// calculate and display the surface area and volume of the rectangle.

class Rectangle {
    // Data members
    private double length, breadth, height;

    // Parameterized constructor to initialize length, breadth, and height
    Rectangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Function to calculate surface area of the rectangle
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    // Function to calculate volume of the rectangle
    public double volume() {
        return length * breadth * height;
    }

    // Function to display the results
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Surface Area: " + surfaceArea());
        System.out.println("Volume: " + volume());
    }
}

public class RectangleExample {
    public static void main(String[] args) {
        // Create an object of Rectangle using parameterized constructor
        Rectangle rect = new Rectangle(5.0, 3.0, 4.0);

        // Display the details, surface area, and volume of the rectangle
        System.out.println("Rectangle Details:");
        rect.display();
    }
}
