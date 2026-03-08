package Queue;

public class ArrImpleCircular {
    static class circularQueue {
        static int arr[];
        static int rear;
        static int size;
        static int front;

        circularQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // IsEmpty:-

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // isFull:-

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        // Add:-

        public static void Add(int data){
            if(isFull()){
                System.out.println("Queue is full!");
                return;
            }
            // Add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear +1)% size;
            arr[rear] = data;
        }
        
        // Remove:-

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // Last ele delete
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1)%size;
            }
            return result;
        }
        // Peek:-
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        System.out.println(q.remove());
        q.Add(4);
        System.out.println(q.remove());
        q.Add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
