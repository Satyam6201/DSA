package Function;

import java.util.Scanner;

public class practoiceQS {
    // QS1:-

    public static double Ave(double a, double b , double c){
        return (a+b+c)/3;
    }

    // QS2:-

    public static boolean isEven(int even){
        if (even % 2 == 0) {
            return true;
        }
        return false;
    }

    // QS3:-

    public static boolean palindrome(int num ){

        int palindrome =num;

        int reverse = 0;
         while(palindrome!=0) {
            int remainder = palindrome%10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
        }
        if (num == reverse) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        // QS1:-

        // Scanner sc = new Scanner( System.in);
        // System.out.println("enter the number");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // System.out.println(Ave(a,b,c));

        // QS2:-

        // System.out.println(isEven(43));

        // QS3:-

        // Scanner sc = new Scanner( System.in);
        // System.out.println("enter the number");
        // int palindrome = sc.nextInt();

        // if (palindrome(palindrome)) {
        //     System.out.println("Number "+ palindrome + " is a palindrome!");
        // }
        // else{
        //     System.out.println("Number " + palindrome + " is not a palindrome!" );
        // }

        // QS4:-

        System.out.println("minimum num "+ Math.min(66, 99));
        System.out.println("maximum number " + Math.max(66, 99));
        System.out.println("square root " + Math.sqrt(7));
        System.out.println("power of the number "+ Math.pow(2, 6));
        System.out.println("abs of the number " + Math.abs(-69));
        

    }
    
}
