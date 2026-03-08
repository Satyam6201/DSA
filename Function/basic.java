package Function;

public class basic {

    // public static void hello(){
    //     System.out.println("hello");
    //     System.out.println("welscom!");
    //     System.out.println("Sigma batch!!");
    // }

    // Function with parameters:-

    // public static void parameter(int a , int b){

        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);
// }

// public static void parameter(){    //formal parameters
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         // System.out.println(x+y);
//         // System.out.println(x*y);  
 

//     }


// swap
public static void swap (int a , int b){
    int temp = a;
    a=b;
    b=temp;

    System.out.println("a is " +a);
    System.out.println("b is " +b);

    
}


    public static void main(String[] args) {
        // hello();

        // parameter(10, 9);

        // parameter(); //actual parameters

        // swap method:-

        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // System.out.println("x is " +x);
        // System.out.println("y is " +y);
        // int temp = x;
        // x=y;
        // y= temp;
        // System.out.println("x is " +x);
        // System.out.println("y is " +y);


        int a = 88;
        int b = 99;
        swap(a,b);
    }
}
