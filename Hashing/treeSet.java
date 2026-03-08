package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        HashSet<String> items = new HashSet<>();
        items.add("Samosa");
        items.add("Chatni");
        items.add("Liti");
        items.add("Chole");
        items.add("Jalebi");
        items.add("Pani");
        items.add("Sprite");

        System.out.println(items); //[Samosa, Chole, Sprite, Liti, Jalebi, Pani, Chatni]

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Samosa");
        lhs.add("Chatni");
        lhs.add("Liti");
        lhs.add("Chole");
        lhs.add("Jalebi");
        lhs.add("Pani");
        lhs.add("Sprite");

        System.out.println(lhs); //[Samosa, Chatni, Liti, Chole, Jalebi, Pani, Sprite]


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Samosa");
        ts.add("Chatni");
        ts.add("Liti");
        ts.add("Chole");
        ts.add("Jalebi");
        ts.add("Pani");
        ts.add("Sprite");

        System.out.println(ts);  //[Chatni, Chole, Jalebi, Liti, Pani, Samosa, Sprite]
    }
}
