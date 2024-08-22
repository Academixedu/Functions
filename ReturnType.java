public class ReturnType {
// Prepare a Logic to reverse a number and return the reversed number

public int reverse(int number){
    int sum=0;
    while(number>0){
        int rem=number%10;
        sum=sum*10+rem;
        number=number/10;
    }
    return sum;

}

public static void main(String[] args) {
    ReturnType t =new ReturnType();
    System.out.println(t.reverse(12345));
}

  
}
