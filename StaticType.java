import java.util.Scanner;

public class StaticType{
// Load 5 Numbers using an Array and Check whether every Number is Prime or not

public static void EvenOdd(int number){
    int count=0;
    if(number==1){
        System.out.println("Not a Prime number");
    }
    else if(number>1){
        for(int i=2;i<number;i++){
            if(number%i==0){
                count+=1;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    else{
        System.out.println("Not a number");
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
