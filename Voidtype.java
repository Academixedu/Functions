import java.util.Scanner;

public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int
public void Prime(int number){
    int count=0;
    if(number==1){
        System.out.println("Not a prime number");
    }
    else if (number>1) {
        for(int i=2;i<number;i++){
            if(number%i ==0){
                count=+1;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    else{
        System.out.println("Not a number");
    }

    
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    Voidtype Vd=new Voidtype();
    Vd.Prime(num);
}
}
