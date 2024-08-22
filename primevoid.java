public class primevoid{


public static void printIsPrime(int b) {
        if (b <= 1) {
            System.out.println(b + " is not prime");
            
        }
        else if(b == 2) {
            System.out.println(b + " is prime ");
           
        }
        else if(b % 2 == 0) {
            System.out.println(b + " is not prime ");
            return;
        }
        for (int i = 3; i * i <= b; i += 2) {
            if (b % i == 0) {
                System.out.println(b + " is not prime.");
                return;
            }
        }
        
        System.out.println(b + " is prime.");
    }
      
    }

