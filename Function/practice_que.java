package Function;

public class practice_que {

    public static int product(int a , int b){
        
        int mul = a*b;
        // System.out.println("product of number is "+a*b);
        return mul;
    }

    public static int factorial (int n){
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact = fact *i; 
        }
        return fact;
    }

    public static int binomial (int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);

        return n_fact/(r_fact*n_r_fact);
    };

    public static int sum (int a , int b){
        return a+b;
    }
    public static int sum (int a , int b, int c){
        return a+b+c;
    }

    public static boolean Prime(int n ){
        // boolean isPrime = true;
        // for(int i = 2; i<= n-1; i++){
        //     if (n % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        // return isPrime;


        // if (n % 2 ==0) {  //corner case
        //     return true;
        // }
         for(int i = 2; i<= n-1; i++){
            if (n % i == 0) {
                return false;
        }
    }
    return true;
}

public static void primeRange(int n ){
    for( int i = 2; i<= n ; i++){
        if (Prime(i)) {
            System.out.print(i +" ");
        }
    }
    System.out.println();
}



    public static void main(String[] args) {

        // Que-1:-

    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //    int mul = product(a, b);
    //    System.out.println(mul);

    //    mul = product(10, 99);
    //    System.out.println(mul);

    // Que-2:-
    // Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();

    // long fact = factorial(a);
    // System.out.println("factorial of the number is "+ fact);

    // Que- 3

    // Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    // float binomial = binomial(a, b);
    // System.out.println(binomial);


    //method overloading;

    // System.out.println(sum(3, 9));
    // System.out.println(sum(3, 7 , 2));


    // prime number:-

    // System.out.println(Prime(9));

    // check prime range :-
    
    primeRange(150);
        
    }
}
