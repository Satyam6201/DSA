package Queue;

public class ArrayImple {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        // IsEmpty:-

        public static boolean isEmpty(){
            return rear == -1;  // rear = -1 the n it is empty
        }

        // Add:-

        public static void Add(int data){
            if(rear == size-1){  // last ele
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1; // add data 
            arr[rear] = data;
        }

        // Remove:-

        public static int remove(){
            if(isEmpty()){
                System.out.println("It is empty!");
                return -1;
            }

            int front = arr[0]; // 0 index ka data front me store hoga
            for(int i = 0; i< rear; i++){ // hear rear = total no.
                arr[i] = arr[i+1]; // 0 = 0+1 (eak piche aa jaega)
            }
            rear = rear -1;
            return front;
        }

        // Peek:-

        public static int peek(){
            if(isEmpty()){
                System.out.println("It is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek()); //1, 2, 3, 4, 5
            q.remove();
        }

        
    }
}
