public class StaticType{
// Load 5 Numbers using an Array and Check whether every Number is Prime or not
public static void checkPrimeArray(int[] numbers) {
    for (int number : numbers) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
}




