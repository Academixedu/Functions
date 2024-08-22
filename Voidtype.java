public class Voidtype {
    int count=0;
    public void prime(int a){
        if(a<=1){
            System.out.println("prime number ");
        }
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
             System.out.println("prime numeber");
        }
         else{
             System.out.println("not a prime number");
        }
    }  
    public static void main(String[]args){
        Voidtype v=new Voidtype();
        v.prime(9);
    }
}

