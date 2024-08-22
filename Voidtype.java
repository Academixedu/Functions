public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int
    public static void checkwhether(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;  
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }
         if (isPrime) {
            System.out.println(num + " is  prime number");
        } else {
            System.out.println(num + " is not  prime number");
        }
    }
    public static void main(String[] args) {
        
        checkwhether(20);  
        checkwhether(38);  
        checkwhether(41);
    }
}


