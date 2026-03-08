package leetcodeqs.Recursion;

public class Basic {
    // public static boolean isPowerOfTwo(int n) {
    //     if(n <= 0){
    //         return false;
    //     }
    //     int n_1 = n-1; // n -1 => 8-1=> 7
    //     return (n & n_1) == 0; //(8 & 7 => 1000  & 0111 => 0000 (true)) ( 10 & 9 => 1010 & 1001 => 1000 (false))
    // }
    // public static void main(String[] args){
    //     int n = 8;
    //     System.out.println(isPowerOfTwo(n));
    // }
    public static double myPow(double x, double n) {
        if (n == 0) {
           return 1;
       }
       if (n < 0) {
           return 1 / myPow(x, -n); // Handle negative powers
       }
       double xn_1 = myPow(x, n-1); 
       double xn = x * xn_1;
       return xn;
   }

    public static void main(String[] args){
       double x = 3.0;
       double n = 3.0;
       System.out.println(myPow(x,n)); 
    }
}
