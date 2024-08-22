import java.util.Scanner;

public class Test{
// Call Three Functions and Implement Here

public void EvenOdd(int number){
    if(number%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}

public static void evenOdd(int number){
    if(number%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
public String Function(String s){
    return s;
}


public static void main(String[] args) {
    Test test=new Test();
    Scanner scanner = new Scanner(System.in);
    int num1=scanner.nextInt();
    String string = test.Function("This is return value Function");
    test.EvenOdd(num1);
    evenOdd(num1);
    scanner.nextLine();
    System.out.println(string);
}
}
