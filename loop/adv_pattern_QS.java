package loop;

import java.util.Scanner;

public class adv_pattern_QS {

    // QS1:-(hollow rectangle) :-

    public static void hollow_rectangle(int row , int col){
        for(int i = 1; i<=row ; i++){
            for(int j = 1; j<= col ; j++){
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Qs2:-

    public static void inverse_pyramid(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j<= row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Qs3:-

    public static void inverse_pyramid_number(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // QS4:-

    public static void floyd_num(int row){
        int count = 1; 
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }

    // QS5:-
    
    public static void zero_one_rectangle(int row, int col){
        for( int i = 1; i<= row; i++){
            for(int j =1; j<= col; j++){
                if ((i+j)%2 ==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int row){
        for( int i = 1; i<= row; i++){
            for(int j =1; j<= i; j++){
                if ((i+j)%2 ==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }


    // QS6:-

    public static void butterFly(int n){

        // 1st half:-

    // for (int i = 1; i <= row; i++) {
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("* ");
    //     }
    //     for(int k = 1; k<= 2*(row-i) ; k++){
    //         System.out.print(" ");
    //     }
    //     for(int l = 1; l<= i; l++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
        
    // }

    for(int i = 1; i<= n ; i++){
        for(int j = 1; j<= i ; j++){
            System.out.print("* ");
        }
        for(int j = 1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
   

    // 2nd half:-

    for(int i = n ; i>= 1; i--){
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for(int k = 1; k<= 2*(n-i) ; k++){
            System.out.print(" ");
        }
        for(int l = 1; l<= i; l++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    // QS7:-

    public static void Rhombus(int row ){
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= row ; k++){
                System.out.print(" *");
            }
            System.out.println();
    }

}


    public static void hollow_Rhombus(int row){
        for(int i = 1; i<= row ; i++){
            for(int j = 1; j<= row-i ; j++){
                System.out.print(" ");
            }

            // hollow rectangle - stars:-

            for(int j = 1; j<= row; j++){
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
    


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // QS1:-

        // System.out.println("enter row number ");
        // int row = Sc.nextInt();
        // System.out.println("enter column number ");
        // int col = Sc.nextInt();

        // hollow_rectangle(row, col);

        // QS2:-

        // System.out.println("enter row number ");
        // int row = Sc.nextInt();
        // inverse_pyramid(row);

        // QS:-3

        // System.out.println("enter the number");
        // int row = Sc.nextInt();
        // inverse_pyramid_number(row);

        

        // QS:-4

        // System.out.println("enter the number:-");
        // int row = Sc.nextInt();
        // floyd_num(row);

        // Qs5:-

        // System.out.println("enter the number:-");
        // int row = Sc.nextInt();

        // zero_one_triangle(row);

        // QS6:-

        // butterFly(4);

        // QS7:-

        // Rhombus(5);

        // QS8:-

        hollow_Rhombus(5);
    }
}
