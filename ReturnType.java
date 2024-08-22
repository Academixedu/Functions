public class ReturnType {
// Prepare a Logic to reverse a number and return the reversed number
public class ReverseNumber {
    
    public static int revNum(int num) {
        int rev = 0;
        
        while (num != 0) {
            int digit = num % 10;
            rev = rev* 10 + digit;
            num=num/ 10;
        }
        
        return rev;
    }

    public static void main(String[] args) {
        int num = 1020304050;
        int revNum = revNum(num);
        System.out.println("Reverse Number: " + revNum);
    }
}

  
}
