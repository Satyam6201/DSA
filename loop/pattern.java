package loop;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // System.out.println("enter the number:- ");
        // int star = Sc.nextInt();

        // for (int i = 1; i <= star; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        System.out.println("enter the number:-");
        int star = Sc.nextInt();
        for(int i = 1; i <= star; i++){
            for(int j = 1 ; j <= star-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // print same number :-

        // System.out.println("enter the number:-");
        // int num = Sc.nextInt();
        // for(int i = 1; i <= num; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // Print number:- 

        // System.out.println("enter the number");
        // int num = Sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.err.println();
        // }

        // print number in oppisite direction:-

        // System.out.println("enter the number");
        // int num = Sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= num-i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Print Words:-

        // System.out.println("enter the number");
        // int line = Sc.nextInt();

        // char ch = 'A';

        // for(int i = 1; i<= line; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }



    }
}
