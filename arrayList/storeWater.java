package arrayList;

import java.util.ArrayList;

public class storeWater {

    //Brute Froce Apporoce :- O(n^2)

    // public static int storeWaters(ArrayList <Integer> height){
    //     int maxWater = 0;
    //     for(int i = 0; i< height.size(); i++){
    //         for(int j = i+1; j< height.size(); j++){
    //             int ht = Math.min(height.get(i) , height.get(j));  // find minimum height of the line 
    //             int width = j - i; // index of line2 - index of line1
    //             int currWater = ht * width; 

    //             maxWater = Math.max(currWater, maxWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // Two Pointer Approach:- O(n)

    public static int storeWaters(ArrayList <Integer> height){
        int maxWater = 0;
        int leftPoniter = 0;
        int RightPointer = height.size()- 1;

        while(leftPoniter < RightPointer){
            int ht = Math.min(height.get(leftPoniter), height.get(RightPointer));
            int width = RightPointer - leftPoniter;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Update Method :-

            if(height.get(leftPoniter) < height.get(RightPointer)){
                leftPoniter++;
            }
            else {
                RightPointer--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWaters(height));
    }
}
