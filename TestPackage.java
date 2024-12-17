import mypackage.MyPackageClass; // Import the class from the package

public class TestPackage {
    public static void main(String[] args) {
        // Create an object of the MyPackageClass
        MyPackageClass obj = new MyPackageClass();
        
        // Call the method from the imported class
        obj.displayMessage();
    }
}
