package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedList<>();
        deque.add(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.offer(4);
        deque.offerFirst(0);
        deque.offerLast(5);
        System.out.println(deque);  // [0, 1, 2, 3, 4, 5]

        System.out.println("First = " + deque.getFirst()); // 0
        System.out.println("Last = " + deque.getLast()); // 5

        deque.remove();
        System.out.println(deque); //[1, 2, 3, 4, 5]
        deque.removeFirst();  //[1, 2, 3, 4]
        deque.removeLast(); //[2, 3, 4]
        System.out.println(deque);
    }
}
