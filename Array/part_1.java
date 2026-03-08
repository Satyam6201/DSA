package Array;

public class part_1 {

    public static void Update(int num[]){
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 10;
        }
    }

    public static int LeanerSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int LeanerSearch2(String name[], String key){
        for (int i = 0; i < name.length; i++) {
            if (name[i] == key) {
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
        System.out.println("smallest value is = " +smallest);
        return largest; 
    }

    // Time Complexity :- (O(logn))
    
    public static int BinarySearch(int number[] , int key){
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start+end)/2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;  
            }
            else{
                end = mid-1; 
            }
        }
        return -1;
    }

    public static void Reverse(int number[]) {
        int start = 0;
        int end = number.length -1;

        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }     
    }

    public static void Pair(int number[]){
        int totalpairs = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];
            for (int j = 1+i; j < number.length; j++) {
                System.out.print("(" + current + "," + number[j]+") ") ;
                totalpairs++;
            }
        System.out.println();
        }
        System.out.println("Total Pairs = " + totalpairs);
    }

    public static void PrintSubArray(int number[]){
        int totalpairs = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print("("+ number[k] +") ");
                }
                totalpairs++;
                System.out.println();
            }
        }
        System.out.println("Total pairs = " +totalpairs);
    }
    public static void main(String[] args) {
        
        // int marks[] = new int[50];

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the marks:- ");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("physics marks is = "+ marks[0] + " chemistry marks is = " +marks[1] + " math marks is = " +marks[2]);

        // int num [] = {22,44,66};
        // Update(num);
        // System.out.println("length of array is = "+num.length);
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println("updated value is = " + num[i]);
        // } 


        //Leaner Search:-
        
        // int number [] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 20;
        // int index = LeanerSearch(number, key);

        // if (index == -1) {
        //     System.out.println("Not found");
        // }
        // else{
        //     System.out.println("index of the number is = " + index);
        // }

        // String name [] = {"satyam" , "shivam" , "shashank" ,"utsav" ,"vivek" , "Ranjan"};
        // String key = "satyam";

        // int Search = LeanerSearch2(name, key);
        
        // if (Search == -1) {
        //     System.out.println("Not found!");
        // }
        // else{
        //     System.out.println("index is " + Search);
        // }

        // Largest number:-

        // int number [] = {11,22,33,44,55,66,77,88,99,110};
        // System.out.println("Largest number is " + Largest(number));
        

        // binary search:-

        // int number [] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 66;
       
        // int index = BinarySearch(number, key);
        // if (index == -1) {
        //     System.out.println("Not found!");
        // }
        // else{
        //     System.out.println("Index is = "+index);
        // }

        // Reverse the number:-

        // int number []= {2,4,6,8,10,12,14,16,18,20};
        // Reverse(number);

        // for (int i = 0; i < number.length; i++) {
        //     System.out.print(number[i]+ " ");
        // }

        // Pair of the number:-

        // int number []= {2,4,6,8,10,12,14};
        // Pair(number);

        // Print subArray:-

        int number [] = {2,4,6,8,10,12,14};
        PrintSubArray(number);

      

        
    }
}
