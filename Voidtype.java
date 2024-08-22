import java.util*;
public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int
  public void prime(){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int count=0;
    if( n==0){
      System.out.println("its not a prime');
    }
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==2)
      System.out.println("Its a prime");
    else
      System.out.println("its not a prime");
    
  }
  public static void main(String[] args){
    Voidtype obj=new Voidtype();
    obj.prime();
  }
}
