package leetcodeqs.Array_QS;

import java.util.Arrays;

public class medium {
    
        // Matrix 2D:-

    public static int [][] generateMatrix(int n){
        int [][] Matrix = new int[n][n];
        int startRow = 0;
        int endRow = n -1;
        int startCol = 0;
        int endCol = n-1;
        int num = 1;

        while (num <= n * n) {
            for(int i = startCol; i<= endCol; i++){
                Matrix[startRow][i] = num++;
            }
            startRow++;

            for(int j = startRow; j<= endRow; j++){
                Matrix[j][endCol] = num++;
            }
            endCol--;

            for(int i = endCol; i>= startCol; i--){
                Matrix[endRow][i] = num++;
            }
            endRow--;

            for(int j = endRow; j >= startRow; j--){
                Matrix[j][startCol] = num++;
            }
            startCol++;
        }
        return Matrix;
    } 
    public static void PrintMatrix(int number[][]){
        for(int [] row : number){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int [][] result = generateMatrix(n);
        PrintMatrix(result);
    }
}
