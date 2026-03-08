package sort_ing;

import java.util.Arrays;
import java.util.Collections;

public class inbuiltArraySort {

    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void PrintArray(Integer arr[]){
        for (Integer i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};

        // To sort the array:-
        // Arrays.sort(arr);

        // To sort the array from where to where:-
        // Arrays.sort(arr,0,3);
        // PrintArray(arr);

        Integer arr[] = {5,4,1,3,2};

        // to reverse the sorted array:-
        Arrays.sort(arr,Collections.reverseOrder());

        //To revese the sorted array from where to where:-
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        PrintArray(arr);
    }
}
