import java.util*;
public class Voidtype {
public void prime(){
Scanner sc = new Scanner(System.in)
int n = Sc.nextInt();
int count = 0;
  if(n==0){
  System.out.println( " Not a prime number");
  }
  for(int i =1; i<n; i++){
   if(n%i==0){
    count++;
   }
  }
  if(count==2)
  System.out.println("Its a prime number);
  else
   System.out.println("Its not a prime number);
}
  public static void main(Strind[] args){
   void type obj = new void type();
    obj.prime();
  }
}
