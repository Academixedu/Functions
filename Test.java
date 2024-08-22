public class Test {

    // Function 1: Prints a  message
    public static void printGreeting() {
        System.out.println("Hello, welcome to the Java class!");
    }

    // Function 2: Calculates and returns the square of a number
    public static int calculatetheSquare(int number) {
        return number * number;
    }

    // Function 3: Checks if a number is even or odd
    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        // Calling the first function
        printGreeting();

        // now Calling the second function and display the result
        int number = 5;
        int square = calculatetheSquare(number);
        System.out.println("The square of " + number + " is " + square);

        // now Calling the third function and display the result
        String evenOdd = checkEvenOdd(number);
        System.out.println(number + " is " + evenOdd);
    }
}
