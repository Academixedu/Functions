public class ReturnType {
// Prepare a Logic to reverse a number and return the reversed number
    public static int reverseNumber(int n) {
        int reversedNumber = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;  
            reversedNumber = reversedNumber * 10 + lastDigit;  
            n = n / 10; 
        }    
        return reversedNumber;
    }
    public static void main(String[] args) {
        int num = 123456789;
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed numbers: " + reversedNum);
    }
}

