package Divide_Conquer;

public class mergeSort {
    public static void MergeSort(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid); //Left Part
        MergeSort(arr, mid+1, ei); //Right Part
        Merge(arr, si, mid, ei);
    }
    public static void Merge(int arr[], int si, int mid, int ei){
        // left(0,3) = element , right(4,6) = 3 element  => ei-si+1 => 6-0+1 = 7 element; 
        int temp[] = new int[ei-si+1];  // How many Data is store (if ei= 5 , si = 0 ,(5-0+1 = 6 element store));
        int i = si; //Itration of Left Part
        int j = mid+1; //Itration of Right part
        int k = 0;  //Conatiner to store the value

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left Part:-
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right Part :-
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // // Copt temp to the original Array:-

        for(k = 0, i = si; k< temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void PrintMergeSort(int number[]){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr, 0 , arr.length-1);
        PrintMergeSort(arr);
    }
}
