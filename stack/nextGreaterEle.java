package stack;

import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {  //O(n)
        int arr [] = {5, 7, 2, 0, 4};
        Stack <Integer> s = new Stack<>();
        int nextGreaterEle [] = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            // Step 1:-
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {  
                s.pop();
            }
            // step 2 :- 
            if (s.isEmpty()) {
                nextGreaterEle[i] = -1;
            }
            else {
                nextGreaterEle[i] = arr[s.peek()];
            }
            // step 3 :- 
            s.push(i);
        }

        for (int i = 0; i < nextGreaterEle.length; i++) {
            System.out.print(nextGreaterEle[i] + " ");
        }

        System.out.println();


        // next right greater (same code)
        // next smallest right( arr[s.peek()] >= arr[i])
        // next left greater(for (i = 0; i< n ; i++))
        // next smallest left( arr[s.peek()] >= arr[i])
    }
}

