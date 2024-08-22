public class Test{
        // Call Three Functions and Implement Here
        public int add(int a, int b) {
            int sum = a+b;  
            return sum; 
        }
        public int multiple(int a, int b) {
            int multiply = a*b;  
            return multiply; 
        }
        public int sub(int a, int b) {
            int sub = a%b;  
            return sub; 
        }
        
        public static void main(String[] args) {
            Test ok = new Test();
            int l = ok.add(5, 7);
            System.out.println(l);
            int l2 = ok.multiple(2, 5);
            System.out.println(l2);
            int l3 = ok.sub(10, 9);
            System.out.println(l3);
        }
}
