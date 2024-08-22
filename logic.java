public class logic {

    // Method to reverse a given number
    public int a(int n) {
        int a = 0;

        while (n != 0) {
            int lastDigit = n % 10;  /*when we divide any number with the 10 the remider will be always last digit of that particular number */
            a = a * 10 + lastDigit;   /*first the a=0,so 0*10=0 now add the variable lastigit to it example 1234 for first itration is  a=0+4 which is a=4 
                                                                                                                    //second iteration a= 4*10+3 that is 43
                                                                                                                    //third iteration a=43*10+2 that is 432
                                                                                                                    //fourth iteration a=432*10+1 that is 4321*/
            n = n / 10;  /*when anything is divided with 10 it removes the last digit now here1234/10=123.4 the decimal value is not considered so its 123 */ 
            /*now this 123 goes back into loop  */
            /*now the 123 is not equal to zero ,so loop continues until the  n value  becomes zero or more precisely zero.somenumber which considered as zero*/
        }

        return a;
    }
}
