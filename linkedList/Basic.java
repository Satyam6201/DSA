package linkedList;
import java.util.LinkedList;
public class Basic {
    public static void main(String[] args) {
        // Create:-
        LinkedList<Integer> ll = new LinkedList<>();

        // Add:-

        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(2, 3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll); //1,2,3,4,5

        // Remove:-

        ll.removeLast(); //5
        ll.removeFirst();//1
        ll.remove(2);//4
        System.out.println(ll); // 2,3

    
    }
}
