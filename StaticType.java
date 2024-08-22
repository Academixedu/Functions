import java.util.Scanner;
public class StaticType{
// Load 5 Numbers using an Array and Check whether every Number is Prime or not
public static void main(String[] args) {
        Scanner g= new Scanner(System.in);
        int[]  b= {1,2,3,4,5};
    for(int i=0;i<=4;i++){
        System.out.println("integer :" +i);
    }
    {
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
}
