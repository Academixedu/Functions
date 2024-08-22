public class ReturnType {
  public static int reverse(int num){
    int r,rev=0;
    while(num>0){
        r=num%10;
        rev=(rev*10)+r;
        num=num/10;
    }
    return rev;
  }
  public static void main(String[]args){
    int num=123456789;
    int revnum=reverse(num);
    System.out.println("Original number "+num);
    System.out.println("Reversed num "+revnum);
  }
}
