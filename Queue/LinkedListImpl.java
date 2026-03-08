package Queue;

public class LinkedListImpl {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    static class Queue{
        static Node Head = null;
        static Node Tail = null;

        public static boolean isEmpty(){
            return Head == null && Tail == null;
        }

        // Add:-

        public static void add(int data){
            Node newNode = new Node(data);
            if(Head == null){
                Head = Tail = newNode;
                return;
            }
            Tail.next = newNode;
            Tail = newNode;
        }

        // Remove 

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = Head.data;
            if(Tail == Head){
                Tail = Head = null;
            }
            else{
                Head = Head.next;
            }
            return front;
        }

        // Peek:-

        public static int Peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return Head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.remove();
        }
    }
}
