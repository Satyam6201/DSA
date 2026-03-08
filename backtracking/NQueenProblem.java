package backtracking;

public class NQueenProblem {

    // Check condition function:-

    public static boolean isSafe(char board[][], int row, int col){

        // Vertical up (condition):-

        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonal left up:-

        for(int i = row-1,j = col-1; i >=0 && j>= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonal Right up:-

        for(int i = row - 1, j = col+1; i>=0 && j< board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void NQueen(char board[][], int row){

        // Base case

        if(row == board.length){
            count++;
            PrintBoard(board);
            return;
        }

        //Kaam:-

        for(int j = 0; j< board.length; j++){  // Column Loop
            if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            NQueen(board, row+1);  // Function call
            board[row][j] = 'X';  // BackTracking call
            }
        }
    }
    public static void PrintBoard(char board[][]){
        System.out.println("------ Chess Board -------");
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char [][] board = new char[n][n];

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){
                board[i][j] = 'X';
            }
        }
        NQueen(board, 0);
        System.out.println();
        System.out.println("Total Ways to solve N Queens problem = " + count);
    }
}
