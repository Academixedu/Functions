public class StaticType {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // now iam Checking for divisibility by 2 and 3
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {29, 15, 23, 8, 19};

        for (int number : numbers) {
            boolean isPrime = isPrime(number);
            System.out.println("Number: " + number + " is Prime: " + isPrime);
        }
    }
}
