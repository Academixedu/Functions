public class Test{
// Call Three Functions and Implement Here
public static void main(String[] args) {
    // 1. Testing ReturnMethod: Reverse a number
    ReturnType returnMethod = new ReturnType();
    int numberToReverse = 12345;
    int reversedNumber = returnMethod.reverseNumber(numberToReverse);
    System.out.println("Reversed Number: " + reversedNumber);

    // 2. Testing VoidMethod: Check if a number is prime
    Voidtype voidMethod = new Voidtype();
    int numberToCheck = 29;
    voidMethod.checkPrime(numberToCheck);

    // 3. Testing StaticMethod: Check prime status of an array of numbers
    int[] numbersArray = {10, 3, 17, 20, 23};
    StaticType.checkPrimeArray(numbersArray);
}
}


