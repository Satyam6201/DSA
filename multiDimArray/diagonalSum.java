package multiDimArray;

public class diagonalSum {
    public static int DiagonalSum(int matrix[][]){
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int sum = 0;

        // for(int i = 0; i< n; i++){
        //     for(int j = 0; j< m; j++){
        //         if (i == j) {
        //             sum += matrix[i][j];
                    
        //         } 
        //         else if (i+j == n-1) {
        //             sum += matrix[i][j];
                    
        //         }
        //     }
        // }

        int sum= 0; 
        for(int i = 0 ; i< matrix.length ; i++){
            sum += matrix[i][i];  //primary diagonal

            if(i != matrix.length-1-i)
            sum += matrix[i][matrix.length-i-1];  //secondary diagonal
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
          };
        System.out.println(DiagonalSum(matrix));
    }
}
