package stack;

import java.util.Stack;

public class stackBasic {

    // LinkedList:-

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   
   // static class Stack{

        // ArrayList:-

        // static ArrayList <Integer> list = new ArrayList<>();
        
            // Empty fun:-

        // public static boolean isEmpty(){
        //    return list.size() == 0;
        // }

           // Push:-

        // public static void push(int data){
        //     list.add(data);
        // }

            // Pop:-

        // public static int pop(){
        //     if (isEmpty()) {
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }

            // Peak(Top):-

        // public static int peak(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     return top;
        // }  

        // LinkedList:-

    //     static Node Head = null;

    //     // isEmpty:-

    //     public static boolean isEmpty(){
    //         return Head == null;
    //     }

    //     // Push:-

    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             Head = newNode;
    //             return;
    //         }
    //         newNode.next = Head;
    //         Head = newNode;
    //     }

    //     //Pop:-

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = Head.data;
    //         Head = Head.next;
    //         return top;
    //     }

    //     // Peak:-

    //     public static int peak(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = Head.data;
    //         return top;
    //     }

    // }

    
    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peak()); // 3,2,1
        //     s.pop();
        // }

        // Stack FameWork:-

        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek()); // 3,2,1
            s.pop();
        }
    }
}
