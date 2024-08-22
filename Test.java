public class Test{
// Call Three Functions and Implement Here
  public void hello(){
  System.out.println("Hello world');
  }
  public static void hi(){
   System.out.println("its a hi function):
   int i = 10;
   int a = 20;
   int sum = int i + int a;
  }
  public int hey(){
   int sum = 2+9;
    System.out.println("Sum"+sum);
    return sum;
  }
  public static void main(String[] ars){
    Test ts=new Test();
    int sum=ts.hey();
    System.out.println("this is hey sum"+sum);
    hi();
    ts.hello();
    
  }
}
