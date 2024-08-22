public class Test{
// Call Three Functions and Implement Here
//first function addition 
public int add(int a, int b) {
    int sum = a+b;  
    return sum; 
}
//secound function is multiplication 
public int multiple(int a, int b) {
    int multiply = a*b;  
    return multiply; 
}

//3rd function is finding reminder 
public int reminder(int a, int b) {
    int rem = a%b;  
    return rem; 
}

public static void main(String[] args) {
    Test ss = new Test();
    int result = ss.add(5, 7);
    System.out.println("The sum is: " + result); 
    int result1 = ss.multiple(2, 5);
    System.out.println("The multiplication is: " + result1);
    int result2 = ss.reminder(12345, 10);
    System.out.println("The reminder is " + result2);
}
}