package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {

    public static void main(String[] args) {  //O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        
        // int maxActivity = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity:-
        // maxActivity = 1;
        // ans.add(0);
        // int lastEnd = end[0];

        // // For other activity:-
        // for(int i = 1; i< end.length; i++){

        //     // Check overlapping(Disjoint)
        //     if(start[i] >= lastEnd){

        //         // Condition is true
        //         maxActivity++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("Maximum Activity = "+ maxActivity);

        // for(int i = 0; i< ans.size(); i++){
        //     System.out.print("A"+ ans.get(i)+ " ");
        // }
        // System.out.println();


        // Array is not shorted then :-

        int activities[][] = new int[start.length][3]; // 3 = (0th place = Index, 1 = start, 2 = end) 
        for(int i = 0; i< start.length; i++){
            activities[i][0] = i ; //index 
            activities[i][1] = start[i];  // Starting point
            activities[i][2] = end[i];  // Ending point 
        }
        
        // For sorting 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));  // lambad function (shorting big array)

        int maxActivities = 0;
        ArrayList <Integer> ans = new ArrayList<>();

        maxActivities = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i< end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxActivities++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("MaxActivity = "+ maxActivities);

        for(int i = 0; i< ans.size(); i++){
            System.out.print("A"+ ans.get(i)+ " ");
        }
        System.out.println();
    }
}
