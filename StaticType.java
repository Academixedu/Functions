import java.util.Scanner;

public class StaticType {
    // Load 5 Numbers using an Array and Check whether every Number is Prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Num " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            if (isPrime(n[i])) {
                System.out.println(n[i] + " is a prime number.");
            } else {
                System.out.println(n[i] + " is not a prime number.");
            }
        }
        
        sc.close();
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
