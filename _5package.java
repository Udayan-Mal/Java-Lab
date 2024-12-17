// 5. Write a Java program to implement the concept of importing classes 
// from user defined package and creating packages.


// Here is an easy and clear example to demonstrate how to **create a package**, **import it**, and use a class from a user-defined package in Java.

// ---

// ### Steps:
// 1. **Create a package**: Define a class inside a package.
// 2. **Compile the package**: Use `javac -d` to specify the directory where the package will be saved.
// 3. **Import the package**: Use the `import` keyword to use the class in another program.
// 4. **Run the program**.

// ---

// ### 1. Creating a Package

// Create a file named `MyPackageClass.java` and place it inside a folder `mypackage` (this will serve as the package name).

// #### **mypackage/MyPackageClass.java**
// ```java
// package mypackage; // Declare the package name

// public class MyPackageClass {
//     public void displayMessage() {
//         System.out.println("Hello from MyPackageClass in user-defined package!");
//     }
// }
// ```

// ---

// ### 2. Compile the Package

// From the terminal or command prompt, navigate to the folder containing the `mypackage` folder and run:
// ```bash
// javac -d . mypackage/MyPackageClass.java
// ```

// - The `-d .` option tells the compiler to store the compiled `.class` files in the current directory while maintaining the package structure.

// ---

// ### 3. Importing and Using the Package

// Now, create another file `TestPackage.java` in the same directory where the `mypackage` folder exists. This program will **import** the class from the `mypackage` package.

// #### **TestPackage.java**
// ```java
// import mypackage.MyPackageClass; // Import the class from the package

// public class TestPackage {
//     public static void main(String[] args) {
//         // Create an object of the MyPackageClass
//         MyPackageClass obj = new MyPackageClass();
        
//         // Call the method from the imported class
//         obj.displayMessage();
//     }
// }
// ```

// ---

// ### 4. Compile and Run the Program

// #### Compile:
// ```bash
// javac TestPackage.java
// ```

// #### Run:
// ```bash
// java TestPackage
// ```

// ---

// ### Output:
// ```
// Hello from MyPackageClass in user-defined package!
// ```

// ---

// ### Explanation:
// 1. **Package Declaration**:
//    - The line `package mypackage;` declares the `mypackage` package in the `MyPackageClass.java` file.
// 2. **Importing**:
//    - The `import mypackage.MyPackageClass;` statement allows the `TestPackage.java` file to access the `MyPackageClass` class.
// 3. **Compilation**:
//    - The `-d` flag during compilation ensures the package structure is maintained.
// 4. **Object Creation**:
//    - The `MyPackageClass` object is created, and its method `displayMessage()` is called.

// ---

// ### Directory Structure:
// ```
// project-folder/
// │
// ├── mypackage/
// │   └── MyPackageClass.java
// │   └── MyPackageClass.class
// │
// └── TestPackage.java
// └── TestPackage.class
// ```

// ---

