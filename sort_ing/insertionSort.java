package sort_ing;

public class insertionSort {
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            while (previous >=0 && arr[previous] > current) { 
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }

    public static void PrintBubbleSort(int number[]){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        InsertionSort(arr);
        PrintBubbleSort(arr);
    }
}
