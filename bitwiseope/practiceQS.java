package bitwiseope;

public class practiceQS {
    public static void QS1(double x){
        double result = Math.pow(x, x);
        System.out.println("The value of " + x + " ^ " + x +" is = " + result);
    }
    public static void QS2(int a , int b){
        System.out.println("before swaping : a = " + a + " b = "+ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swaping : a = " + a + " b = " + b);
    }
    public static void QS4(){
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.println((char)ch | ' ');
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number:- ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // QS2(num1, num2);
        // double x = sc.nextDouble();
        // QS1(x);

        QS4();

    }
}
