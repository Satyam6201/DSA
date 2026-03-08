package string;

public class Palindrome {
    public static boolean Palindrome(String name){
        for(int i = 0; i< name.length() ; i++){
            int n = name.length();
            if (name.charAt(i) != name.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(Palindrome(str));
    }
    
}
