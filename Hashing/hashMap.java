package Hashing;

import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert:- O(1)
        map.put("copy", 50);
        map.put("pen", 10);
        map.put("pencil", 12);
        map.put("marker", 25);

        // System.out.println(map);  //{marker=25, pen=10, copy=50, pencil=12}

        // // get:- O(1)
        // System.out.println(map.get("pen"));  // 10
        // System.out.println(map.get("book"));  //null

        // // containsKey:- O(1)

        // System.out.println(map.containsKey("copy"));  //true
        // System.out.println(map.containsKey("scale"));  //false

        // // Remove:- O(1)
        // System.out.println(map.remove("pen"));  //10
        // System.out.println(map.remove("ruber")); //null

        // // Size:- O(1)
        // System.out.println(map.size()); //3

        // // isEmpty:- O(1)
        // System.out.println(map.isEmpty()); // false

        // // clear
        // map.clear(); // clear all the data from the hashmap

        // iteration method:-

        Set<String> keys = map.keySet();

        // Loop:-
        for (String k : keys) {
            System.out.println("keys = "+k +", value = " + map.get(k));
        }

    }
}
