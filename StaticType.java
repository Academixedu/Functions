public class StaticType{
    public  static int pro(int a) {
        
        if (a<=1) {
          return 0;
        }
        else if (a<=3) {
            return 1;
        }
        else if (a%2==0 || a%3==0) {
          return 0;
        }
        else{
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
             return 0;
    }
}
        
}
return 1;
    }
    public static void gun(int n) {
        if (pro(n)==1) {
            System.out.println(n+" :is a prime number");
        }
        else{
            System.out.println(n+" :is not a prime number");
        }
    }
        public static void open(int[] kal){
            for (int y : kal) {
                gun(y);
            }
        }
        public static void main(String[] args) {
            StaticType c = new StaticType();
            int[] fk = {2,5,6,7,8,77,66,54,32,}; 
           open(fk);
        }
    }
    
