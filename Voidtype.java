public class Voidtype {

    // Void is the function to check whether a number is prime and print the final result
    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        if (number == 2) {
            System.out.println(number + " is a prime number.");
            return;
        }
        if (number % 2 == 0) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }

    public static void main(String[] args) {
        // now we are checking the Prime function with different numbers
        checkPrime(29); 
        checkPrime(15); 
        checkPrime(1);  
        checkPrime(2);  
        checkPrime(37); 
    }
}
