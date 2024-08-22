import java.util.Scanner;
public class logicimpliment {

    public static void main(String[] args) {
        Scanner tt=new Scanner(System.in);
         System.out.print("please enter the number above two digits:");
        int number = tt.nextInt();
        logic ss = new logic(); 
        int reversed = ss.a(number); 
        System.out.println("Reversed Number: " + reversed);  
    }
}
