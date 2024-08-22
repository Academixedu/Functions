public class StaticType {
    public void prime(int a){
        if(a<=1){
            System.out.println("prime number ");
        }
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }
         else{
             System.out.println("not a prime number");
        }
    }
    public static void main(String[] args) {
        StaticType st=new StaticType();
        int[]array={13,14,15,16,17};
        for(int num:array){
            st.prime(num);
        }
    }
}