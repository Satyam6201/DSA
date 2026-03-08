package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question {
    // QS.5:- (interLeave 2 halves Queue) 1 2 3 4 = 1 3 2 4 ans

    public static void interLeave(Queue <Integer> q){
        Queue <Integer> firsthalf = new LinkedList<>();

        int size = q.size();

        for(int i = 0; i< size/2 ; i++){   // n/2 = 5
            firsthalf.add(q.remove()); // add = 1,2,3,4,5
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());  //6,7,8,9,10,1,2,3,4,5
            q.add(q.remove()); // 1,6,2,7,3,8,4,9,5,10
        }
    }

    // QS.6:- (Queue reverse) 1,2,3,4 = 4,3,2,1

    public static void reverse(Queue <Integer> q){
       Stack <Integer> s = new Stack<>();

       while(!q.isEmpty()){
        s.push(q.remove());
       }
       while(!s.isEmpty()){
        q.add(s.pop());
       }
    }

    //  implement stack using deque:-

    static class stack{
        Deque<Integer> d = new LinkedList<>();

        // push:-
        public void push(int data){
            d.addLast(data);
        }

        //Pop:-
        public int pop(){
            return d.removeLast();
        }

        // peek:-
        public int peek(){
            return d.getLast();
        }
    }

     //  implement Queue using deque:-

    static class queue{
        Deque<Integer> d = new LinkedList<>();

        // Add:-
        public void add(int data){
            d.addLast(data);
        }

        // Remove:-
        public int remove(){
            return d.removeFirst();
        }

        // Peek:-
        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        // Queue <Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);
       
        // interLeave(q);  // 1,6,2,7,3,8,4,9,5,10
        // reverse(q);  //10 9 8 7 6 5 4 3 2 1 
        // while (!q.isEmpty()) {
        //     System.out.print(q.remove()+ " "); 
        // }

        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
    }
}
