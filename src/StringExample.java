public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello, World!";
        String name = new String("John Doe");

        // Concatenation
        String fullName = "John" + " " + "Doe";
        System.out.println("Full Name: " + fullName);

        // String methods
        System.out.println("Length of full name: " + fullName.length());
        System.out.println("First character of name: " + fullName.charAt(0));

        // String comparison
        String anotherName = "John Doe";
        boolean isSame = fullName.equals(anotherName);
        System.out.println("Is full name equal to another name? " + isSame);

        // Modifying string (returns a new string)
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Uppercase full name: " + upperCaseName);

        // Substring and replace
        String firstName = fullName.substring(0, 4);
        System.out.println("First name: " + firstName);
        String replacedName = fullName.replace("Doe", "Smith");
        System.out.println("Replaced full name: " + replacedName);
    }
}
