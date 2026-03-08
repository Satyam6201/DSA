import java.util.Scanner;

public class rivision3 {

    public static int LinearSearch(int Number[] , int key){
        for(int i = 0 ; i< Number.length ; i++){
            if (Number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int Largest(int number[]){
        int largest = Integer.MIN_VALUE; // misius infinity
        int smallest = Integer.MAX_VALUE; // plus infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest value is = " + smallest);
        return largest; 
    }

    public static int BinarySearch(int number[] , int key){
        int start = 0;
        int end = number.length-1;

        while (start<= end) {
            int mid = (start+end)/2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void Reverse(int number[]){
        int start = 0;
        int end = number.length-1;
        
        while (start< end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] =temp;

            start++;
            end--;
        } 
    }
    public static void Pair(int Number[]){
        for(int i = 0; i< Number.length; i++){
            int current = Number[i];
            for(int j = i+1; j< Number.length ;j++){
                System.out.print("("+ current + "," + Number[j] + ")");
            }
        System.out.println();
    }
}
    public static void SubArray(int number[]){
        for(int i = 0; i< number.length; i++){
            int start = i;
           for(int j = i; j< number.length ; j++){
            int end = j;
            for(int k = start; k<=end; k++){
                System.out.print("{"+ number[k] + "}" );
            }
            System.out.println();
           }
           System.out.println();
        }
    }

    public static void MaxSumSubArray(int number []){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<= number.length; i++){
            int start = i;
            for(int j = i ; j< number.length ;j++){
                int end = j;
                currentSum = 0;
                for(int k = start; k<= end; k++){
                    currentSum += number[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The maxmum sum of the SubArray is = "+ maxSum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[100];

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy marks = " + marks[0]);
        // System.out.println("chy marks = " + marks[1]);
        // System.out.println("bio marks = " + marks[2]);

        // int percent = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("percentage = " + percent + "%");

        // int arr []= { 22,33,44,55,66,77,88};
        // int key = 88;
        
        // int LinearSearch = LinearSearch(arr, key);
        // if (LinearSearch == -1) {
        //     System.out.println("Not Found!");
        // }
        // else{
        //     System.out.println("The number is found at index " + LinearSearch);
        // }

        // int number [] = {11,22,33,44,55,66,77,88,99,110};
        // System.out.println("Largest number is = " + Largest(number));

        int number [] = {11,22,33,44,55,66,77,88,99,110};
        int key = 99;
        System.out.println("Index of key is = "+ BinarySearch(number, key));

        // int number [] = {11,22,33,44,55,66,77,88,99};
        // Reverse(number);
        // for(int i = 0; i< number.length; i++){
        //     System.out.print(number[i] + " ");
        // }
        // System.out.println();

        // int number [] = {11,22,33,44};
        // Pair(number);
        // SubArray(number);

        // MaxSumSubArray(number);
        
        


    }
}
