package Divide_Conquer;

public class quickSort {
    public static void QuickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        // Last Element:-
        int Pindex = Partation(arr, si, ei);
        QuickSort(arr, si, Pindex-1);
        QuickSort(arr, Pindex+1, ei);
    }
    public static int Partation(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //To make Palce For the Small Element

        for(int j = si; j< ei; j++){
            if (arr[j] <= pivot) {
                i++;
                // Swap:-
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void PrintQuickSort(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length-1);
        PrintQuickSort(arr);
    }
}
