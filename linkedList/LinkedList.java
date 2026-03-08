package linkedList;

public class LinkedList {
        public static class Node{
            int data;
            Node next;
    
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node Head;
        public static Node Tail;
        public static int size;
    
        // Add first :-

        public void addFirst(int data){
    
            // Step 1 = Create new Node
            Node newNode = new Node(data);
            size++;
            // If Head is Null
            if(Head == null){
                Head = Tail = newNode;
                return;
            }
    
            // Step 2 = NewNode next = head
            newNode.next = Head;
    
            // Step 3 = Head = newNode
            Head = newNode;
        }
    
        // Add Last:-

        public void addLast(int data){
            // Step1 - Create Node
            Node newNode = new Node(data);
            size++;
    
            // If Head is null
            if(Head == null){
                Head = Tail = newNode;
                return;
            }
    
            // step2 - NewNode.next = tail
            Tail.next = newNode;
    
            // Step3 - Tail = NewNode
            Tail = newNode;
        }
    
        // Print a LinkedList:-
    
        public void print() {
            Node temp = Head;
            if(Head == null){
                System.out.println("LinkedList is empty!");
                return;
            }
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println(" null");
        }
    
        // Adding value by using index :-

        public void adds (int index, int data){
            if(index == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = Head;
            int i = 0;
    
            while(i < index-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Remove First:-

        public int removeFirst(){
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
            size--;
            return val;
        }

        // Remove Last:-

        public int removeLast(){
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
            Node prev = Head;
            for(int i = 0; i<= size-2; i++){
                prev = prev.next;            
            }
            int val = prev.next.data;
            prev.next = null;
            Tail = prev;
            size--;
            return val;
        }

        // Reverse method:-

        public void Reverse(){   // O(n)
            Node prev = null;
            Node curr = Tail = Head;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Head = prev;
        }

        // Cycle Loop:-

        public static boolean isCycle(){
            Node slow = Head;
            Node fast = Head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        // Remove Cycle:-
        
        public static void removeCycle(){
            //Detect Cycle:-
            Node slow = Head;
            Node fast = Head;
            boolean cycle = false;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(fast == slow){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }
            // Find Meeting point:-
            slow = Head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            // remove Cycle:-
            prev.next = null;  // Last node = null
        }
        
        // Merge Sort in the LinkedList:-

        private Node getMid(Node Head){
            Node slow = Head;
            Node fast = Head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        private Node Merge(Node Head1, Node Head2){
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;  // -1

            while (Head1 != null && Head2 != null) {
                if(Head1.data <= Head2.data){
                    temp.next = Head1;
                    Head1 = Head1.next;
                    temp = temp.next; 
                }else{
                    temp.next = Head2;
                    Head2 = Head2.next;
                    temp = temp.next;
                }
            }
            while(Head1 != null){
                temp.next = Head1;
                Head1 = Head1.next;
                temp = temp.next;
            }
            while(Head2 != null){
                temp.next = Head2;
                Head2 = Head2.next;
                temp = temp.next;
            }
            return mergeLL.next;
        }

        public Node MergeSort(Node Head){
            if(Head == null || Head.next == null){
                return Head;
            }

            // Find mid
            Node Mid = getMid(Head);
            // left & Right Mid Side :-
            
            Node rightHead = Mid.next;
            Mid.next = null;
            Node newLeft = MergeSort(Head);
            Node newRight = MergeSort(rightHead);

            // Merge :-

            return Merge(newLeft, newRight);
        }
        
        // 1.QS (Iterative Search):-

        public int IterativeSearch(int key){
            Node temp = Head;
            int index = 0;

            while(temp != null){
                if(temp.data == key){
                    return index;
                }
                temp = temp.next;
                index++;
            }
            // Key is not found 
            return -1;
        }

        // 2.QS (Recursion Iterative Search):-

        public int helper(Node Head, int key){  // O(n)
            if(Head == null){
                return -1;
            }
            if(Head.data == key){
                return 0;
            }
            int index = helper(Head.next, key);
            if(index == -1){
                return -1;
            }
            return index + 1;
        }
        public int recSearch(int key){
            return helper(Head, key);
        }

        // 3.QS:- (remove Nth Node):-

        public void deleteNthNode(int n){

            // Calculate Size :-
            int sz = 0; // Size 
            Node temp = Head;
            while(temp != null){
                temp = temp.next;
                sz++;
            } 
            if(n == sz){
                Head = Head.next; // Remove First Operation
                return;
            }
            // Size - n
            int i = 1;
            int indexFind = sz-n;
            Node prev = Head;
            while (i < indexFind) {
                prev = prev.next;
                i++;
            }
            // jis ko remove karna hoga usse phle wale ko previus maan lenge or us k baad next.next us kar k jis ko remove krna hoga us ko hata dange 
            prev.next = prev.next.next;  // 1->2->4->5-> null
            return;
        }

        // 4.QS:- (Palindrome)

        public Node findMid(Node Head){
            Node slow = Head;
            Node fast = Head;
            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
            }
            return slow;
        }
        public boolean checkPalindrome(){
            // Base case
            if(Head == null || Head.next == null){
                return true;
            }

            //step 1 :- Find Mid
            Node midNode = findMid(Head);

            //step 2 :- reverse the 2nd Half 
            Node prev = null;
            Node curr = midNode;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // Head of Right Node
            Node left = Head;

            // Step 3:-
            while (right != null) {
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        // 5.QS(Zig-Zag-Number):-

        public void zigZag(){
            // Find mid

            Node slow = Head;
            Node fast = Head;
            while(fast != null & fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // Reverse 2nd half:-

            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = Head;
            Node right = prev;
            Node nextL, nextR;

            // Alternat merging:-

            while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    public static void main(String[] args) {
      LinkedList l = new LinkedList();
    
            // Adding elements to the LinkedList using add() method

            // l.print();
            // l.addFirst(2);
            // l.print();
            // l.addFirst(3);
            // l.print();

            // l.addLast(4);
            // l.print();
            // l.addLast(5);
            // l.print();

            // l.adds(2, 10);
            // l.print();

            // l.removeFirst();
            // l.print();
            
            // // l.removeLast();
            // // l.print();

            // System.out.println(l.size);
            
            // l.addFirst(2);
            // l.addFirst(1);
            // l.addLast(4);
            // l.addLast(5);
            // l.adds(2, 3);
            // l.print();

            // l.Reverse();
            // l.print();

            // Head = new Node(1);
            // Node temp = new Node(2);
            // Head.next = temp;  // remove Cycle 
            // Head.next.next = new Node(3);
            // Head.next.next.next = new Node(4);
            // Head.next.next.next.next = new Node(5);
            // // Head.next.next.next.next.next = Head;  // 1->2->3->4->5->1  
            // // Head.next.next.next.next.next.next = new Node(6);  // 1->2->3->4->5->1->6  (False)
            // Head.next.next.next.next.next = temp;  // 1->2->3->4->5->2 
            // System.out.println(isCycle()); // True
            
            // // Remove Cycle:-

            // removeCycle();
            // System.out.println(isCycle());

            // Merge Sort:-

            // l.addFirst(1);
            // l.addFirst(2);
            // l.addFirst(3);
            // l.addFirst(4);
            // l.addFirst(6);
            // l.addFirst(5);
            // l.print();     // 5->6->4->3->2->1
            // l.Head = l.MergeSort(l.Head);
            // l.print();

            // QS:-

            // l.addFirst(2);
            // l.addFirst(1);
            // l.addLast(4);
            // l.addLast(5);
            // l.adds(2, 3);
            // l.print();

            // System.out.println(l.IterativeSearch(3)); // 2
            // System.out.println(l.IterativeSearch(6)); // -1

            // System.out.println(l.recSearch(3)); // 2
            // System.out.println(l.recSearch(6)); // -1

            // remove function
            // l.deleteNthNode(3);  // 1->2->4->5-> null
            // l.print();

            // l.addFirst(2);
            // l.addFirst(1);
            // l.addLast(2);
            // l.addLast(1);
            // l.print();
            // System.out.println(l.checkPalindrome());  // true

            l.addFirst(5);
            l.addFirst(4);
            l.addFirst(3);
            l.addFirst(2);
            l.addFirst(1);
            l.print(); // 1->2->3->4->5-> null
            l.zigZag(); 
            l.print(); //1->5->2->4->3-> null
        }
    }

