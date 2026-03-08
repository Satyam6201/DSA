package leetcodeqs;

public class BasicQS {

    // Two Sum:-

    // public static int[] twoSum(int[] nums, int target) {
    //         for (int i = 0; i < nums.length; i++) {
    //               for (int j = i + 1; j < nums.length; j++) {
    //                   if (nums[i] + nums[j] == target) {
    //                       return new int[] {i, j}; 
    //                   }
    //               }
    //           }
    //           throw new IllegalArgumentException("No two sum solution");
    //       }
    //       public static void main(String[] args) {
    //           int[] nums = {2, 7, 11, 15};
    //           int target = 9; 
    //           int[] result = twoSum(nums, target);
    //       System.out.println("Indices: " + result[0] + ", " + result[1]);
    //   }

    //  RemoveDuplicates :-

    // public static int RemoveDuplicates(int num []){
    //     if (num.length == 0 ) {
    //         return 0;
    //     }
    //     int Index = 0;
    //     for(int i = 0; i < num.length ; i++){
    //         if(num[i] != num[Index]){
    //             Index++;
    //             num[Index] = num[i];
    //         }
    //     }
    //     return Index +1;
    // }
    // public static void main(String[] args) {
    //     int [] num = {1,1,2};
    //     int count = RemoveDuplicates(num);
    //     System.out.println(count);
    //     for(int i = 0; i< count; i++){
    //         System.out.print(num[i] + " ");
    //     }
    // }

    // Remove element:-

    public static int RemoveElement(int num[] , int val){
        int k = 0;
        for(int i = 0; i< num.length; i++){
            if(num[i] != val){
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int num[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k  = RemoveElement(num, val);
        for(int i = 0; i< k ; i++){
            System.out.print(num[i]+ " ");
        }
    }


    }
