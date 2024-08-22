public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int


   
    public static void checkPrimenum(int number) {
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
            System.out.println(number + " is a prime number");
        } 
        else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        int num = 31; 
        int num1 =30;
        
        checkPrimenum(num);
        checkPrimenum(num1);
    }
}


