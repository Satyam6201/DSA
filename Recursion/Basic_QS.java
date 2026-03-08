package Recursion;

public class Basic_QS {

    // 1.QS:-

    public static void PrintDec(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }

    // 2.QS:-

    public static void PrintInc(int n){
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
    }

    // 3.QS:-

    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        int fn_1 = Factorial(n-1);
        int fn =  n * Factorial(n-1);
        return fn;
    }

    // 4.QS:-

    public static int Sum_Natural(int n){
        if(n == 1){
            return 1;
        }
        int num = Sum_Natural(n-1);
        int sum = n + Sum_Natural(n-1);

        return sum;
    }

    // 5.QS:-

    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fn_1 = Fibonacci(n-1);
        int fn_2 = Fibonacci(n-2);
        int fib_n = fn_1 + fn_2;

        return fib_n;
    }

    // 6.QS:-

    public static boolean isSorted(int arr[] , int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    // 7.QS:-

    public static int FirstOcc(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOcc(arr, key, i+1);
    }

    // 8.QS:-

    public static int LastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOcc(arr, key, i+1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // 9.QS:-

    public static int Power(int x, int n){  //O(n)
        if(n == 0){
            return 1;
        }
        int xn_1 = Power(x, n-1);
        int xn = x * xn_1;

        return xn;
    }

    // 10.QS:-

    public static int OptimizePower(int x, int n){  //O(logn)
        if(n == 0){
            return 1;
        }
        int halfPower = OptimizePower(x, n/2);
        // If N is even:-
        int halfPowerSq = halfPower * halfPower;

        // If N is odd:-
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String[] args) {
        // int n = 10;
        // PrintDec(n);

        int n = 10;
        PrintInc(n);

        // int n = 5;
        // System.out.println(Factorial(n));

        // int n = 5; 
        // System.out.println(Sum_Natural(n));

        // int n = 8;
        // System.out.println(Fibonacci(n));

        // int [] arr = {1,2,3,4,3,6};
        // System.out.println(isSorted(arr, 2));

        // int [] arr = {8,3,6,9,5,10,2,5,3};
        // int key = 5;
        // System.out.println(FirstOcc(arr, key, 0));

        // int [] arr = {8,3,6,9,5,10,2,5,3};
        // int key = 5;
        // System.out.println(LastOcc(arr, key, 0));

        // int x = 5;
        // int n = 3;
        // System.out.println(Power(x, n));

        // int x = 5;
        // int n = 3;
        // System.out.println(OptimizePower(x, n));
    }
}
