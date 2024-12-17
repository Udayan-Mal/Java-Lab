// 3. Design a class Named Circle. Construct three circle objects with 
// radius 2.0,12,24 and displays the radius and area of each. 
// A no-arg constructor set the default value of radius 
// to 1.AgetArea() method is used to return the area of the circle. 
// Now implement the class

class Circle {
    // Instance variable for radius
    private double radius;

    // Default constructor (no-arg) - sets radius to 1
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor - sets radius to the given value
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius; // Formula: π * r^2
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Radius: " + radius + ", Area: " + getArea());
    }

    public static void main(String[] args) {
        // Create three circle objects with given radii
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12.0);
        Circle circle3 = new Circle(24.0);

        // Display details of each circle
        System.out.println("Circle 1 Details:");
        circle1.displayCircleDetails();

        System.out.println("Circle 2 Details:");
        circle2.displayCircleDetails();

        System.out.println("Circle 3 Details:");
        circle3.displayCircleDetails();

        // Demonstrate the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Details:");
        defaultCircle.displayCircleDetails();
    }
}
