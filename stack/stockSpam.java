package stack;

import java.util.Stack;

public class stockSpam {
    public static void stackSpam(int stock[], int spam[]){
        Stack <Integer> s = new Stack<>();
        spam[0] = 1;  // first ele val 
        s.push(0); 

        for(int i = 1; i< stock.length; i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]){  // 70 > 60
                s.pop();
            }
            if(s.isEmpty()){
                spam[i] = i+1; //  value is greater then all the value 
            }
            else{
                int prevHigh = s.peek();  // prev greater value 
                spam[i] = i - prevHigh;   
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int spam[] = new int[stock.length];

        stackSpam(stock, spam);
        for(int i = 0; i< spam.length; i++){
            System.out.print(spam[i] + " ");
        }
    }
}
