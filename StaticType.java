import java.util.*;
public class StaticType{
// Load 5 Numbers using an Array and Check whether every Number is Prime or not
  public static String prime(int n){
    if(n<=1)
      return "It's not a prime";
    for(int i=2;i<n;i++){
      if(n%i==0)
        return "its not a prime";
    }
    return "its a prime";
      
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    String[] s=new String[n];
    for(int i=0;i<n;i++){
      s[i]=prime(arr[i]);
    }
    for(int i=0;i<n;i++){
      System.out.println(arr[i]+"  "+s[i]);
    }
    
    
  }
}
