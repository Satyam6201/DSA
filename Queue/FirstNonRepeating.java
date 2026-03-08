package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void firstNonRepeating(String str){
        int freq[] = new int[26]; // 'a' - 'z'
        Queue <Character> q = new LinkedList<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; 

            while (!q.isEmpty() && freq[q.peek() - 'a'] >  1) { // remove repeation character
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " "); // after removing if q is empty then q return -1 
            }
            else{
                System.out.print(q.peek()+ " "); // q is non empty then return 1st non repeating charcter
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeating(str);
    }
}
