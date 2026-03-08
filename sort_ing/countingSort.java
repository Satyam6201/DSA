package sort_ing;

public class countingSort{
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int j = 0; j< arr.length; j++){
            count[arr[j]]++;
        }
        int j = 0;
        for(int k = 0 ; k< count.length; k++){
            while (count[k] > 0) {
                arr[j] = k;
                j++;
                count[k] --;
            }
        }
    }
    public static void PrintBubbleSort(int number[]){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args) {
        
    int arr[] = {1,4,1,3,2,4,3,7};
    CountingSort(arr);
    PrintBubbleSort(arr); 
}
}