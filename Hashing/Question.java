package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Question {

    // QS.2:- Anagram

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i< t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {  // == 1 then direct remove those element
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch) - 1);  // more then 1 then -1 from the original value 
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    // QS.5:- Itinerary Ticket

    public static String getStart(HashMap<String, String> ticket) {

        HashMap<String, String> revMap = new HashMap<>();

        // for To:-
        for (String key : ticket.keySet()) {
            revMap.put(ticket.get(key), key);
        }

        // From:-
        for (String key : ticket.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;  // Starting point
            }
        }
        return null;
    }


    // public static void main(String[] args) {
    //     // Majority element:- O(n)
    //     int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i< arr.length; i++) {
    //         // if(map.containsKey(arr[i])) {  // numbers comes multiple times 
    //         //     map.put(arr[i], map.get(arr[i])+1);
    //         // }
    //         // else{
    //         //     map.put(arr[i], 1); // numbers comes 1st time 
    //         // }  
                  
    //                 // OR
    //         // If value is exist then it add 1 in the count, if not exist then add only 1
    //         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  
    //     }
    //     // Set<Integer> keySet = map.keySet();
    //     // for (Integer key : keySet) {

    //                 //  OR

    //     for (Integer key : map.keySet()) {
    //         if (map.get(key) > arr.length/3) {
    //             System.out.println(key); // 1 ans
    //         }
    //     }
    // }


    public static void main(String[] args) {

        // QS.2:- Anagram:-
        // String s = "race";
        // String t = "care";

        // System.out.println(isAnagram(s, t)); //true

        // QS.3:- Count distrinct element:-

        /* 
        int nums[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);  //[1, 2, 3, 4, 5, 6, 7]
        System.out.println("Size of the element = " + set.size());  //Size of the element = 7
        */

        //QS.4:- Union and interSection:-
        
                //union:- 

                /* 
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0; i< arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union = " + set.size());  //Union = 6
        for (Integer value : set) {
            System.out.print(value + " ");  // 2 3 4 6 7 9
        }
        System.out.println();

                //Intersection:-

        set.clear();

        HashSet<Integer> intersection = new HashSet<>();

        for(int i = 0; i< arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i< arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                intersection.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = " + count); //Intersection = 2
        for (Integer value : intersection) {
            System.out.print(value + " "); //3 9
        }
        System.out.println();
        */

        // QS.4:- Ticket :-
        /*

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
            */


            // QS.5:- Largest sum with the zero(0) sum

        int arr[] = {15, 2, -2, -8, 1, 7, 10};
        HashMap<Integer, Integer> map = new HashMap<>();
            
        int sum = 0;
        int length = 0;

        for(int i = 0; i< arr.length; i++) {
            sum+= arr[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        System.out.println("Largest subArray with sum as 0 => " + length);
    }
}
