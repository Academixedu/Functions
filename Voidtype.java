public class Voidtype {
// Prepare a Void Function to check whether a number is prime or not with a parameter of int
public static void even (int a){
    if(a%2==0){
        System.out.println("the provided number :"+a+" is even");
    }else{
        System.out.println("the provided number :"+a+" is odd");
    }
}
public static void main(String[] args) {
    Voidtype ss=new Voidtype();
    ss.even(34);
    ss.even(37);
    ss.even(25343);
}
}

