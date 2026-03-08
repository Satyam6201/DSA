package sort_ing;

public class BubbleSort {

    // Worst Case(O(n^2))

    public static void bubbleSort(int number[]){
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 -i; j++) {
                if (number[j] > number[j+1]) {

                    // swaping method:-
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }

    // Optimize Bubble Sort :- (O(n))

    public static void BubbleSorts(int arr[]) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            
            // If no swaps were made, array is already sorted
            if (!swapped) break;
        }
    }

    public static void PrintBubbleSort(int number[]){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int number [] = {5,4,2,33,11,0,1,3,7};
        bubbleSort(number);
        PrintBubbleSort(number);

        // int[] arr = {5, 1, 4, 2, 8};
        // System.out.println("Original array: " + Arrays.toString(arr));
        // BubbleSorts(arr);
        // System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
