package sort_ing;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i< arr.length - 1; i++){
            int maiPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maiPos] > arr[j]) {
                    maiPos = j;
                } 
            }
            // swap:-
            if (maiPos != i) {
            int temp = arr[maiPos];
            arr[maiPos] = arr[i];
            arr[i] = temp;
            }
        }
    }
    public static  void PrintBubbleSort(int number[]){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        PrintBubbleSort(arr);
    }
}
