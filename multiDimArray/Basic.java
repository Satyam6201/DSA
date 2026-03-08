package multiDimArray;
import java.util.Scanner;

public class Basic {

    public static boolean Searching(int martix[][] , int key){
        for(int i = 0; i< martix.length ; i++){
            for(int j = 0; j< martix[0].length ; j++){
                if(martix[i][j] == key){
                    System.out.println("key is found on "+ "(" +i + "," + j + ")");
                    return  true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int martix [][] = new int[3][3];
        int n = martix.length; //row 
        int m = martix[0].length; //column

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                martix[i][j] = sc.nextInt();   
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }
        Searching(martix, 6);
    }
}
