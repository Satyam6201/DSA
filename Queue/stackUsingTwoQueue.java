package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingTwoQueue {
    static class Stack{
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        // isEmpty:-

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push:-

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);  // q1 == NonEmpty then al the element push in the q1
            }
            else{
                q2.add(data);  // if(q1 is full) then all the element add in the q2
            }
        }
        
        // Pop:-

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove(); // top = 1,2,3
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        
        // peek:-

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            
            int top = -1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();          
                q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
