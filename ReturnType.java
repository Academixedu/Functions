import java.util.*;
public class ReturnType {
// Prepare a Logic to reverse a number and return the reversed number
    public int resversd(int rs){
     int r=0;
      int rev;
      while(rs>0){
        rev=rs%10;
        r=r*10+rev;
        rs=rs/10;
        
      }
      return r; 
    }
  public static void main(String[] args){
    System.out.println("Enter the number you need to reverse:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ReturnType obj=new ReturnType();
    int num=obj.resversd(n);
    System.out.println("revesered number"+num);
  }
  
}
