public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // Example of a String (non-primitive type)
        String myString = "Hello, World!";
        System.out.println("String value: " + myString);  // Prints: Hello, World!
        System.out.println("String length: " + myString.length());  // Prints the length of the string

        // Example of an Array (non-primitive type)
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println("First element in array: " + myArray[0]);  // Access and print the first element of the array

        // Example of a custom class (non-primitive type)
        Person person1 = new Person();  // Creating an object of the Person class
        person1.name = "John";
        person1.age = 30;
        System.out.println("Person's Name: " + person1.name);  // Access and print the person's name
        System.out.println("Person's Age: " + person1.age);    // Access and print the person's age
    }
}

// Custom class (non-primitive type)
class Person {
    String name;  // Instance variable for storing the person's name
    int age;      // Instance variable for storing the person's age
}
