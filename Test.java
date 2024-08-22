import java.util.Scanner;
public class Test{
// Call Three Functions and Implement Here


    // Function 1: number is prime or not
    public static void checkPrime(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; 
        } 
        else {
            for (int i = 2; i <=  Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function 2: Reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number=number/ 10;
        }

        return reversed;
    }

    // Function 3: sum of the digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number=number/ 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  prime
        int number1 = 2;    
        //  reverse
        int number2 = 54321; 
        // sum of digits 
        int number3 = 2345;  
        

        // calling number1
        checkPrime(number1);

        // Calling number2
        int reversedNumber = reverseNumber(number2);
        System.out.println("Reversed Number of " + number2 + " is: " + reversedNumber);

        // Calling number3
        int sumDigits = sumOfDigits(number3);
        System.out.println("Sum of digits of " + number3 + " is: " + sumDigits);
    }
}


