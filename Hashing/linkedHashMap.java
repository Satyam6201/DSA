package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        
        lhm.put("India", 130);
        lhm.put("China", 150);
        lhm.put("Nepal", 30);
        lhm.put("USA", 50);

        // Print in the order
        System.out.println(lhm);  //{India=130, China=150, Nepal=30, USA=50}

        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 130);
        hm.put("China", 150);
        hm.put("Nepal", 30);
        hm.put("USA", 50);

        // Print in the unorder
        System.out.println(hm);  //{USA=50, China=150, Nepal=30, India=130}


    }
}
