import java.util.Scanner;

public class StaticType{
// Load 5 Numbers using an Array and Check whether every Number is Prime or not

public static void EvenOdd(int number){
    if (number%2==0) {
        System.out.println("Even");        
    }
    else{
        System.out.println("Odd");
    }
}

public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[]array=new int[5];
     StaticType a=new StaticType();

    for(int i=0;i<=array.length-1;i++){
        array[i]=sc.nextInt();
    }
    

    for(int i=0;i<=array.length-1;i++){
        System.out.println("The element at index  "+i+"is "+array[i]+" is");
        a.EvenOdd(array[i]);
    }


}
}
