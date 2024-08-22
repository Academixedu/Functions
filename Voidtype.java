public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int
public void checkPrime(int number) {
    boolean isPrime = true;
    if (number <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= number/ 2; i++) {
            if ( number % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println( number + " is a prime number.");
    } else {
        System.out.println( number + " is not a prime number.");
    }
}
}

