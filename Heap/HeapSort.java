package Heap;

public class HeapSort {
    // Heapify:-
    public static void Heapify(int arr[], int i, int size) {
        // Parents -> child
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;

        // for asscending order 
        if (left < size && arr[left] > arr[maxIndex]) {  // for descending order(arr[left] < arr[maxIndex])  
            maxIndex = left;
        }

        // for asscending order 
        if (right < size && arr[right] > arr[maxIndex]) {   // for descending order(arr[right] < arr[maxIndex])
            maxIndex = right;
        }
        
        if (maxIndex != i) {
            // Swap:-
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            Heapify(arr, maxIndex, size);
        }
    }
    public static void heapSort(int arr[]) {  //O(nlogn)
        // Total length:-
        int n = arr.length;

        // step.1 :- To build max heap
        for(int i = n/2; i>= 0; i--) {
            Heapify(arr, i, n);
        }

        // Step.2:- Push largest element at the end:-
        for(int i = n-1; i> 0; i--) {
            // Swap:-
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
