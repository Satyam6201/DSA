package leetcodeqs.Recursion;

public class Medium {
    public static boolean DividedbyThree(int n){
        if(n <= 0){
            return false;
        }
        if(n % 3 ==0){
            return true;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        System.out.println(DividedbyThree(29));
    }
}
