public class VariableExplanation {
    public static void main(String[] args) {
        // Declaring a local variable to store an integer
        int age = 25;  // Variable 'age' stores the age of a person
        System.out.println("Age: " + age);

        // Declaring a variable to store a name (String type)
        String name = "John";  // Variable 'name' stores the name of the person
        System.out.println("Name: " + name);

        // Declaring a variable to store a floating-point number (height in meters)
        float height = 1.75f;  // Variable 'height' stores the height of the person in meters
        System.out.println("Height: " + height + " meters");

        // Declaring a constant (final variable) to store the maximum allowed age
        final int MAX_AGE = 100;  // This is a constant, meaning the value cannot be changed
        System.out.println("Maximum allowed age: " + MAX_AGE);

        // Variables can be updated, except for final variables
        age = 30;  // Updating the value of the 'age' variable
        System.out.println("Updated Age: " + age);

        // Demonstrating the scope of variables
        if (age > 18) {
            String status = "Adult";  // This is a local variable inside the if block
            System.out.println("Status: " + status);
        }

        // The 'status' variable is not accessible outside the if block
        // System.out.println(status);  // This would cause an error
    }
}
