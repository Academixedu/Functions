import java.util.Scanner;

public class Test{
// Call Three Functions and Implement Here

// Function 1
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

 // Function 2
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

 // Function 3
    public static int squareNumber(int k) {
        return k * k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//function 1
        System.out.print("Enter a name: ");
        String str = scanner.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("Reversed name: " + reversedStr);

//function 2
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        boolean even = isEven(num);
        if (even) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
//function 3
        int squared = squareNumber(num);
        System.out.println("Square of " + num + " is: " + squared);

    }
}


   
  