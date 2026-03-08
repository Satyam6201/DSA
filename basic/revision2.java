import java.util.Scanner;

public class revision2 {
    public static void add(int a , int b ){
        System.out.println("addition of 2 number is = " + (a+b));
    }
    public static int product(int a, int b){
        int products = a*b;
        return products;    
    }

    public static int factorial (int num){
        int fact = 1; 
        for(int i = 1; i<= num ; i++){
            fact = fact*i;
            // System.out.println(fact + " ");
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int n_fact= factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);

        int binomials = n_fact / r_fact*n_r_fact ;
        return binomials;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number = ");
        int a = sc.nextInt();
        System.out.println("enter the second number = ");
        int b = sc.nextInt();
        // add(a, b);
        // int mul = product(a, b);
        // System.out.println(mul);

        // System.out.println(factorial(a));

        System.out.println(binomial(a, b));
    }
}
