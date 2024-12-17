// 7. Write a program in Java to show the examples of i)call by value and ii) call by reference.

// ii) Call by Reference (Object Type)

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class CallByReferenceExample {

    // Method to demonstrate call by reference
    public static void modifyPerson(Person person) {
        person.name = "John";  // Modifies the name of the original object
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Original name: " + person.name);
        
        modifyPerson(person);  // Passes the reference of 'person' to the method
        
        System.out.println("Name after modifyPerson: " + person.name);  // The object is modified
    }
}
