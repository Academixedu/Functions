public class Test{
    public static  void Mf (int x,int y) {
        // Function-1
        System.out.println("STATIC-Function-1");
        System.out.println("subtract: "+(x-y));
      
    }
    public  void omfoo(char r,int s) {
          // Function-2
      System.out.println("VOID-Function");
      System.out.println("Gender: "+r+"-"+s);
}
public String Niks(String n) {
    return n;
}
public static void main(String[] args) {
    Test.Mf(21, 9);
    Test k=new Test();
    k.omfoo('M', 19);
    String op;
    op=k.Niks("moon");
     System.out.println(op);
   
}
}
// Call Three Functions and Implement Here