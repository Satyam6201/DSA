package bitwiseope;

import java.util.Scanner;

public class Basic {
    public static void oddOrEven(int num){
        int bitmask = 1;
        if ((num & bitmask)== 0) {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    public static int getIthBit(int num , int i){
        int bitmask = 1 << i;
        if ((num & bitmask) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int num , int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }

    public static int clearIthBit(int num , int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }

    public static int updateIthBit(int num , int i , int newBit){
        // if (newBit == 0) {
        //     return clearIthBit(num, i);
        // }
        // else{
        //     return setIthBit(num, i);
        // }

        num = clearIthBit(num, i);
        int bitmask = newBit << i;
        return num | bitmask;
    }

    public static int lastIthBits(int num , int i){
        int bitmask = (-1)<<i;
        return num & bitmask;
    }

    public static int rangeIthBits(int num , int i , int j ){
        int a = (-1) << (j+1);
        int b = (1 << i) -1 ;

        int bitmask = a|b;
        return num & bitmask;
    }

    public static boolean  powOf2(int num){
        return (num &(num-1)) == 0;
    }

    public static int countBit(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) != 0){
                count++;
            }
            num = num>>1;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(5 & 6); //binary AND
        // System.out.println( 5 | 6); //binary OR
        // System.out.println(5 ^ 6); //binary XOR
        // System.out.println(~5);
        // System.out.println(1<<2);
        // System.out.println(5>>2);

        // oddOrEven(3);
        // oddOrEven(8);

        System.out.println("enter the number:- ");
        int num = sc.nextInt();
        // int IthBit = sc.nextInt();

        // System.out.println(getIthBit(num, IthBit));
        // System.out.println(setIthBit(num, IthBit));
        // System.out.println(clearIthBit(num, IthBit));
        // System.out.println(updateIthBit(num, IthBit , 1));
        // System.out.println(lastIthBits(num, IthBit));
        // System.out.println(rangeIthBits(num, IthBit, 4));
        // System.out.println(powOf2(num));
        System.out.println(countBit(num));
        
    }
}
