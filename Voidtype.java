public class Voidtype {
    public void prime(int n){
        

    int i,m=0,flag=0; 
    m=n/2; 
    if(n==0||n==1)
        {
         System.out.println(n+" is not prime number");
        }
    else
        { for(i=2;i<=m;i++)
            { 
                if(n%i==0)
                { 
                System.out.println(n+" is not a prime no");
                 flag=1;
                }
            }
                 if(flag==0) {
                    System.out.println(n+" is prime");
                 }



// Prepare a Void Function to check whether a number is prime or not with a parameter of int
}
}
    }
