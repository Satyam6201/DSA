package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1); //O(n)
        hs.add(10);
        hs.add(100);
        hs.add(2);
        hs.add(23);
        hs.add(1);
        hs.add(2);
        hs.add(10);

        System.out.println(hs); //[1, 2, 100, 23, 10]

        // Contains:- O(n)

        if (hs.contains(2)) {
            System.out.println("2 is Contains"); 
        }
        if (hs.contains(1)) {
            System.out.println("1 is Contains");
        }
        if (hs.contains(3)) {
            System.out.println("3 is Contains");
        }

        // Remove:-O(n)

        System.out.println(hs.remove(100)); //true
        System.out.println(hs); //[1, 2, 23, 10]

        // Size 
        System.out.println(hs.size()); //4

        // Clear
        hs.clear();
        System.out.println(hs); 

        // isEmpty:-

        System.out.println(hs.isEmpty()); //true

        // Iteration in the HashSet

        HashSet<String> items = new HashSet<>();
        items.add("Samosa");
        items.add("Chatni");
        items.add("Liti");
        items.add("Chole");
        items.add("Jalebi");
        items.add("Pani");
        items.add("Sprite");

        // Iterator item = items.iterator();
        // while (item.hasNext()) {
        //     System.out.print(item.next() + " "); //Samosa Chole Sprite Liti Jalebi Pani Chatni
        // }

        for (String item : items) {
            System.out.print(item + " "); //Samosa Chole Sprite Liti Jalebi Pani Chatni 
        }
    }
}
