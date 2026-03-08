package Recursion;

public class Hard_QS {
    
    // 11.QS:-

    public static int TillProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fn_1 = TillProblem(n-1);
        int fn_2 = TillProblem(n-2);
        int totalWays = fn_1+ fn_2;
        return totalWays;
    }

    // 12.QS:-

    public static void RemoveDuplicate(String str, int index, StringBuilder newString, boolean []map){

        // Base class:-
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        // kaam:-
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            RemoveDuplicate(str, index+1, newString, map);
        }
        else{
            map[currChar - 'a'] = true;
            RemoveDuplicate(str, index+1, newString.append(currChar), map);
        }
    }

    // 13.QS:-

    public static int FriendPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //Single :-
        int fn_1 = FriendPair(n-1);
        // For Pair:-
        int fn_2 = FriendPair(n-2);
        int pairWays = (n-1) * fn_2;

        // TotalWays:-
        int totalWays = fn_1 + pairWays;
        return totalWays;
    }
    
    // 14.QS:-

    public static void PrintBinOne(int n, int lastPlace, String str){
        if(n == 0){
            System.out.print(str + " ");
            return;
        }
        PrintBinOne(n-1, 0, str+"0");
        if(lastPlace == 0){
            PrintBinOne(n-1, 1, str+"1");
        }
    }

    public static void PrintBinZero(int n, int lastPlace, String str){
        if(n == 0){
            System.out.print(str + " ");
            return;
        }
        PrintBinZero(n-1,0, str+"1");
        if (lastPlace == 0) {
            PrintBinZero(n-1, 1, str+"0");
        }
    }

    public static void main(String[] args) {
        // int n = 5;
        // System.out.println(TillProblem(n));

        // String str = "appnnacollage";
        // RemoveDuplicate(str, 0, new StringBuilder (""), new boolean[26]);

        // int n = 4;
        // System.out.println(FriendPair(n));

        PrintBinOne(3, 0, ""); //Constitive One is not allow
        System.out.println(" ");
        PrintBinZero(3, 0, ""); // Constitive Zero is not allow
    }
}
