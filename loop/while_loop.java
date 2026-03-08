package loop;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 9;
        // while (n<10) {
        //     System.out.println("Hi");
        //     n++;
        // };
        
        // Print table:-
        
        // System.out.println("enter the number you wants the table");
        // int table = sc.nextInt();
        // int table_print = table;

        // System.out.println("your table is:-");
        // while (table_print <= table*10){
        //     System.out.println(table_print);
        //     table_print = table_print + table;
        // };

        // int num = 1;
        // while (num<=10) {
        //     System.out.println(num);
        //     num++;
        // }

        // int num = 1;
        // int n = sc.nextInt();
        // while (num<=n) {
        //     System.out.print(num + " ");
        //     num++;
        // }

        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i<= n) {
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println("sum of the number is " + sum);

        // int i = 1;
        // while (i<= 4) {
        //     System.out.println("* * * *");
        //     i++;
        // }

        // Reverse the number-

        // int reverse = sc.nextInt();

        // while (reverse>0) {
        //     int lastDigit = reverse %10 ;
        //     System.out.print(lastDigit);
        //     reverse = reverse/10;
        // }

        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    };
};
