package stack;

import java.util.Stack;

public class Qusetion {

    // QS.1(Push At Bottom):-  O(1)

    public static void pushAtBottom(Stack <Integer> s, int data){
        if(s.isEmpty()){   // when stack is empty
            s.push(data);  // then push new Element 
            return;
        }
        int top = s.pop();  // Store the top value -> 3
        pushAtBottom(s, data); // again call the function
        s.push(top); 
    }

    // QS.2 (Reverse the String):--

    public static String reverse(String str){
        Stack <Character> s = new Stack<>();
        int index = 0;

        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    // QS.3:- (Reverse the stack):-

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack <Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // QS.6:- Valid Parenthese(({[]}))

    public static boolean validParenthes(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            // Opening condition:-

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            // closing condition:-

            else {
                if(s.isEmpty()){  // ")))"
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || // "()"
                    (s.peek() == '{' && ch == '}') ||    // "{}"
                    (s.peek() == '[' && ch == ']')){     // "[]"
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        // step 3:- stack is empty or not
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    } 

    // QS.7:- (duplicate or not)
    
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            // Closing codition:-
            
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  // it is duplicate
                }
                else{
                    s.pop();
                }
            }
            else{
                // opening:-
                s.push(ch);
            }
        }
        return false;
    }

    // QS.8:- (max rectangle area of histogram):-

    public static void maxArea(int arr[]){  //O(n)
        int maxArea = 0;
        int nsl[] = new int[arr.length]; // left smallest
        int nsr[] = new int[arr.length]; // right smallest

        // Right smallest:-

        Stack <Integer> s = new Stack<>();
        for(int i = arr.length -1; i>= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // left smallest:-
        s = new Stack<>();
        for(int i = 0; i< arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area :-
        for(int i = 0; i< arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max Area of the Rectangle of histogram = "+ maxArea);
    }
    public static void main(String[] args) {
        // QS.1:-

        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);

        // while (!s.isEmpty()){
        //     System.out.println(s.peek()); // 3,2,1,4
        //     s.pop();
        // }
    
        // QS.2:-

        // String str = "abc";
        // String result = reverse(str);
        // System.out.println(result);

        // QS.3:-

        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // 3,2,1
        // reverseStack(s);
        // printStack(s); // 1,2,3

        // QS.6:-

        // String str = "({[]}){[()]}";
        // System.out.println(validParenthes(str));

        // QS.7:-

        // String str = "(a+b)";  // false (not duplicate)
        // String str2 = "((a+b))+ (c)"; // true(Duplicate)
        // System.out.println(isDuplicate(str));
        // System.out.println(isDuplicate(str2));

        // QS.8:-

        int height[] = {2, 1, 5, 6, 2, 3};
        maxArea(height);


    }
}
