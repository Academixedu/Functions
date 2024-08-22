public class Test{
// Call Three Functions and Implement Here
  public void hello(){
    System.out.println("hello world");
  }
  public static void hi() {
    System.out.println("its a hi function");
    int i=10;
    int a=9;
    int sum=i+a;
  }
  public int hey(){
    int sum=2+90;
    System.out.println("Sum:"+sum);
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
