public class Test{
public static int function1(int a,int b){
    return a+b;
}
public static int function2(int a,int b){
    return a-b;
}
public static int function3(int a,int b){
    return a*b;
}
public static void main(String[]args){
    Test t=new Test();
    System.out.println(t.function1(4,6));
    System.out.println(t.function2(8,6));
    System.out.println(t.function3(2,3));
}
}
