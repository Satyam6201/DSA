package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class fractKnapsack {

    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        // 0th place = index, 1th place = ratio

        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i; // index
            ratio[i][1] = value[i]/(double)weight[i]; // ratio of value & weight
        }

        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));  // Arrange in ascending order

        int capacity = w;
        int finalvalue = 0;

        // For Descending order:-
        for(int i = ratio.length-1; i>= 0; i--){
            int index =(int)ratio[i][0];
            if(capacity >= weight[index]){
                finalvalue += value[index];
                capacity -= weight[index];
            }
            else{
                // Fraction value include:-

                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break; 
            }
        }
        System.out.println("Final value = "+ finalvalue);
    }
}
