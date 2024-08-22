public class ReturnType {

    public static int reverseNumber(int number) {
        int reversed = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit;
            number /= 10; 
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
        
        number = -6789;
        reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}
