package Heap;

import java.util.ArrayList;

public class insertInHeap {

            // Min Heap:- 

    // static class Heap {  //O(logn)
    //     ArrayList<Integer> arr = new ArrayList<>();

    //     public void add(int data) {
    //         arr.add(data); // Add in the last index

    //         int x = arr.size()-1;  // sixe of the ArrayList
    //         int parents = (x-1)/2;  // according to formula
            
    //         // Swap
    //         while (arr.get(x) < arr.get(parents)) {
    //             int temp = arr.get(x);
    //             arr.set(x, arr.get(parents));
    //             arr.set(parents, temp);

    //             x = parents;
    //             parents = (x-1)/2;
    //         }
    //     }
    //     public int peek() {
    //         return arr.get(0);
    //     }

    //     // Heapify:-

    //     private void Heapify(int index) {
    //         int left = 2*index + 1;
    //         int right = 2*index + 2;
    //         int minIndex = index;


    //         if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
    //             minIndex = left;
    //         }
    //         if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
    //             minIndex = right;
    //         }
    //         if (minIndex != index) {
    //             // swap:-
    //             int temp = arr.get(index);
    //             arr.set(index, arr.get(minIndex));
    //             arr.set(minIndex, temp);

    //             Heapify(minIndex);
    //         }
    //     }

    //     // Remove:-
    //     public int Remove() {
    //         int data = arr.get(0);
            
    //         // Step 1:- Swap first and last
    //         int temp = arr.get(0);
    //         arr.set(0, arr.get(arr.size()-1));
    //         arr.set(arr.size()-1, temp);

    //         // step2 :- Remove last index
    //         arr.remove(arr.size()-1);

    //         // step3:- fix my heap
    //         Heapify(0);
    //         return data;
    //     }

    //     // Empty condition:-
    //     public boolean isEmpty() {
    //         return arr.size() == 0;
    //     }
    // }
    // public static void main(String[] args) {
    //     Heap h = new Heap();
    //     h.add(3);
    //     h.add(4);
    //     h.add(1);
    //     h.add(5);

    //     while (!h.isEmpty()) {
    //         System.out.println(h.peek());
    //         h.Remove();
    //     }
    // }


            //    Max Heap:- 


    static class Heap {   //O(logn)
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data); // Add in the last index

            int x = arr.size()-1;  // sixe of the ArrayList
            int parents = (x-1)/2;  // according to formula
            
            // Swap
            while (arr.get(x) > arr.get(parents)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(parents));
                arr.set(parents, temp);

                x = parents;
                parents = (x-1)/2;
            }
        }
        // For Peek:-
        public int peek() {
            return arr.get(0);
        }

        // Heapify:-

        private void Heapify(int index) {
            int left = 2*index + 1;
            int right = 2*index + 2;
            int minIndex = index;


            if (left < arr.size() && arr.get(minIndex) < arr.get(left)) {
                minIndex = left;
            }
            if (right < arr.size() && arr.get(minIndex) < arr.get(right)) {
                minIndex = right;
            }
            if (minIndex != index) {
                // swap:-
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                Heapify(minIndex);
            }
        }

        // Remove:-
        public int Remove() {
            int data = arr.get(0);
            
            // Step 1:- Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step2 :- Remove last index
            arr.remove(arr.size()-1);

            // step3:- fix my heap
            Heapify(0);
            return data;
        }

        // Empty condition:-
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.Remove();
        }
    }
}
