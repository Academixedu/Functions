public class ReturnType {
// Prepare a Logic to reverse a number and return the reversed number
public int reverseNumber(int number) {
    int reversed = 0;
    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }
    return reversed;
}
}
  

