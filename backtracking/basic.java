package backtracking;

public class basic {

    // 1.QS
    public static void ChangeArr(int num[], int index, int value){
        // Base case:-

        if(index == num.length){
            PrintArr(num);
            return;
        }

        // Kaam:-

        num[index] = value;
        ChangeArr(num, index+1, value+1); // agle element k liye
        num[index] = num[index] - 2; // Backtracking step

    }
    public static void PrintArr(int num[]){
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }

    // 2.QS

    public static void FindSubSet(String str, String ans, int index){
        // Base Case:-

        if(index == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else {
            System.out.println(ans);
        }
        return;
    }
        // Kaam:-

        FindSubSet(str, ans+str.charAt(index), index+1); //Yes opertaion(Add the element)
        FindSubSet(str, ans, index+1); //No operation(Does't add the element);
    }

    // 3.QS:-

    public static void FindPermutation(String str, String ans){
        // Base Case:-

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Kaam:-

        for(int i = 0; i < str.length(); i++){
        char curr = str.charAt(i);

        String newStr = str.substring(0,i) + str.substring(i+1);
        FindPermutation(newStr, ans+curr);
        }
    }
    
    // 5.QS:-

    public static int gridWays(int row, int col, int n, int m){
        
        // Base Case:-

        if(row == n-1 || col == m-1){
            return 1;
        }
        else if(row == n || col == m){
            return 0; 
        }

        int Ways_1 = gridWays(row+1, col, n, m); // Down condition 
        int Ways_2 = gridWays(row, col+1, n, m); // Right condition

        return Ways_1 + Ways_2;
    }
    public static void main(String[] args) {
        // int [] num = new int[5];
        // ChangeArr(num , 0 , 1);
        // PrintArr(num);

        // String str = "abc";
        // FindSubSet(str, "", 0);

        // String str = "abc";
        // FindPermutation(str, "");

        int n = 3;
        int m = 3;

        System.out.println(gridWays(0, 0, n, m));
    }
}
