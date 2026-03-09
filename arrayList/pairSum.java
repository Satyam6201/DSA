package arrayList;

import java.util.ArrayList;

public class pairSum {

    // Brute Force Approach:-


    public static boolean PairSum(ArrayList <Integer> pair, int target){
        for(int i = 0; i< pair.size(); i++){
            for(int j = i+1; j< pair.size(); j++){
                if(pair.get(i) + pair.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    // Two Pointer Approach:-

    public static boolean PairSum1 (ArrayList <Integer> pair, int target){
        int lp = 0;
        int rp = pair.size() - 1;
        while (lp < rp) {
            if(pair.get(lp) + pair.get(rp) == target){
                return true;
            }
            else if(pair.get(lp) + pair.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    //  Pair Multiple (Two Pointer Approach):-

    public static boolean PairMul(ArrayList<Integer> pair, int target){
        int lp = 0;
        int rp = pair.size() - 1;
        while(lp < rp){
            if(pair.get(lp) * pair.get(rp) == target){
                return true;
            }
            else if(pair.get(lp) * pair.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    //  Brute force (UnSorted Array)

    // public static boolean PairSum2(ArrayList <Integer> pair, int target){
    //     for(int i = 0; i< pair.size(); i++){
    //         for(int j = 0; j< pair.size(); j++){
    //             if(pair.get(i) + pair.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    // Two pointer Approach (O(n)):-
    
    public static boolean PairSum2(ArrayList<Integer> pair, int target){
        int breakPoint = -1; // pivet
        int n = pair.size();
        for(int i = 0; i< pair.size(); i++){
            if(pair.get(i) > pair.get(i+1)){
                breakPoint = i;
                break;
            }
        }
        int lp = breakPoint + 1; // Smallest
        int rp = breakPoint;  // Larger

        while(lp != rp){

            // Case 1:-
            if(pair.get(lp) + pair.get(rp) == target){
                return true;
            }

            // Case 2:-

            if(pair.get(lp) + pair.get(rp) < target){
                lp = (lp +1) % n;
            }
            if(pair.get(lp) + pair.get(rp) > target){
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);
        int target = 11;
        System.out.println(PairSum(pair, target));  //5 + 6
        // System.out.println("Multiple Function = " + PairMul(pair, 18)); // 3 * 6 = 18

        ArrayList<Integer> pair2 = new ArrayList<>();
        pair2.add(11);
        pair2.add(15);
        pair2.add(6);
        pair2.add(8);
        pair2.add(9);
        pair2.add(10);

        // System.out.println(PairSum2(pair2, 16)); // 6+10
    }
}
