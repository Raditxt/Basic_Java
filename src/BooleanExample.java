public class BooleanExample {
    public static void main(String[] args) {
        // Boolean variable declaration and initialization
        boolean isJavaFun = true;   // A boolean value set to true
        boolean isFishTasty = false; // A boolean value set to false

        // Output the boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Using booleans in conditional statements
        System.out.println("Yes, Java is fun!");

        // Example of a boolean expression
        int x = 10;
        int y = 20;
        boolean comparisonResult = x < y;  // true because 10 is less than 20

        System.out.println("Is x less than y? " + comparisonResult);

        // Using the not (!) operator
        boolean reverseResult = !comparisonResult;  // false because !true is false
        System.out.println("Reverse of comparisonResult: " + reverseResult);
    }
}
