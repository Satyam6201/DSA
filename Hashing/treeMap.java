package Hashing;

import java.util.HashMap;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 130);
        tm.put("USA", 50);
        tm.put("China", 150);
        tm.put("Nepal", 30);
        tm.put("UK", 40);

        // In Sorting order(Based on key(word))
        System.out.println(tm);  //{China=150, India=130, Nepal=30, UK=40, USA=50}

        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 130);
        hm.put("China", 150);
        hm.put("Nepal", 30);
        hm.put("USA", 50);
        hm.put("UK", 40);

        // Print in unSorted order
        System.out.println(hm); //{USA=50, China=150, UK=40, Nepal=30, India=130}
    }
}
