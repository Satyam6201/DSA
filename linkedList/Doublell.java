package linkedList;


public class Doublell {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    // Add First:-

    public void AddFirst(int data){
        // Create newNode
        Node newNode = new Node(data);
        size++;
        //check head is not null
        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;
    }

    // Add Last:-

    public void AddLast(int data){
        Node newNode = new Node(data);
        size++;

        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        newNode.prev = Tail;
        Tail.next = newNode;
        Tail = newNode;
    }
    
    // Remove First:-

    public int removeFirsts(){
        if(size == 0){
            System.out.println("LinkedList is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        Head.prev = null;
        size--;
        return val;
    }
     
    // Remove Last:-

    public int removeLasts(){
        if(Head == null){  // size == 0
            System.out.println("LinkedList is empty!");
            return Integer.MIN_VALUE;
        }
        else if(Head.next == null){   // size == 1
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }

        int val = Tail.data;

        if(Head == Tail){  // only one element in the LinkedList
            Head = Tail = null;
        }
        else{
            Tail = Tail.prev; // tail = tail k piche ka ele
            Tail.next = null;  // tail = tail k aage wala null
        }
        return val;
    }

    // Reverse Method:-

    public void reverse(){

        Node curr = Head;
        Node prev = null;
        Node next;

        while(curr != null){   // last element tak chalega
            next = curr.next;  
            curr.next = prev;  
            curr.prev = next;  
            prev = curr;
            curr = next;
        }
        Head = prev; 
    }
    
    // Print fun:-

    public void print(){
        Node temp = Head;

        if(Head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
        Doublell dll = new Doublell();
        dll.AddFirst(2);
        dll.AddFirst(1);

        dll.print();  // 1<->2<-> null

        dll.AddLast(3);
        dll.AddLast(4);

        dll.print(); // 1<->2<->3<->4<-> null

        dll.removeFirsts();
        dll.print(); //2<->3<->4<-> null

        dll.removeLasts();
        dll.print();   //2<->3<-> null

        dll.AddFirst(1);

        dll.print(); //1<->2<->3<-> null
        dll.reverse(); 
        dll.print(); //3<->2<->1<-> null

        System.out.println(dll.size);
    }
}
