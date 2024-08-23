import java.util.Scanner;

public class StaticType{
     public void array(int []n){

  
//    public static void main(String[] args) {
//     Scanner on=new Scanner(System.in);

// System.out.println("enter the length");
// int length=on.nextInt();

    
//         int[] n=new int[length];
//       for(int i=0;i<=n.length-1;i++){

//              System.out.println(n[1]+"   cheak wheather no is prime or not");  
//               int in=on.nextInt();

//                n[i]=in;
//       }

      for(int i=0;i<=n.length-1;i++){

        
      int m=0,flag=0; 
        m=n[i]/2; 
        if(n[i]==0||n[i]==1)
            {
             System.out.println(n[1]+"   is not prime number");
            }
        else
            { for(int k=2;k<=m;k++)
                { 
                    if(n[i]%k==0)
                    { 
                    System.out.println(n[i]+"   is not a prime no");
                     flag=1;
                     break;
                    }
                }
                     if(flag==0) {
                        System.out.println(n[i]+"   is prime");
                     }
    
    
    
    // Prepare a Void Function to check whether a number is prime or not with a parameter of int
    }

    }
    


// Load 5 Numbers using an Array and Check whether every Number is Prime or not
}
}
