public class Voidtype {
    public  void prime(int a,String P, String NP) {
        if (a<=1) {
            System.out.println(a+" :"+NP );
        }
        else if (a<=3) {
            System.out.println(a+" :"+P);
        }
        else if (a%2==0 || a%3==0) {
            System.out.println(a+" :"+NP );
        }
        else{
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                System.out.println(a+" :"+NP );
              return;
    }
}
System.out.println(a+" :"+P);
}
    }
}
// Prepare a Void Function to check whether a number is prime or not with a parameter of int

