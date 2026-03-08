
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hard {

    // Majority Element 
    public static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        // 1st pass - Voting phase
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println("Processing: " + num);
            if (num == candidate1) {
                count1++; // 2 -> 
            } else if (num == candidate2) {
                count2++; // 2 -> 3 -> 
            } else if (count1 == 0) {
                candidate1 = num; // 3 -> 1 
                count1 = 1; // 1 -> 1(1)
            } else if (count2 == 0) {
                candidate2 = num; // 2 ->
                count2 = 1; // 1 -> 
            } else {
                count1--; // 1 -> 0
                count2--;// 2 -> 1
            }

            System.out.println("Candidate1: " + candidate1 + ", Count1: " + count1);
            System.out.println("Candidate2: " + candidate2 + ", Count2: " + count2);
            System.out.println("---");
        }

        // 2nd pass - Count actual occurrences
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) count1++;
            else if (nums[i] == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }

    // Four sum :- 

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Loop to fix the first two numbers
        for (int i = 0; i < n - 3; i++) {
            // if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {
                // if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicate j

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for left and right
                        // while (left < right && nums[left] == nums[left + 1]) left++;
                        // while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

     public int[] maximizeXor(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int xi = queries[i][0];
            int mi = queries[i][1];
            int maxXOR = -1;

            System.out.println("\nQuery " + i + ": xi = " + xi + ", mi = " + mi);
            System.out.println("Valid nums[j] ≤ mi:");

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= mi) {
                    int currentXOR = xi ^ nums[j];
                    System.out.println("nums[" + j + "] = " + nums[j] + ", XOR = " + xi + " ^ " + nums[j] + " = " + currentXOR);
                    if (currentXOR > maxXOR) {
                        maxXOR = currentXOR;
                        System.out.println("Updated maxXOR = " + maxXOR);
                    }
                }
            }

            if (maxXOR == -1) {
                System.out.println("No valid nums[j] ≤ mi. Result = -1");
            }

            result[i] = maxXOR;
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] nums = {3, 2, 3, 2, 2, 1, 1, 1};
        // List<Integer> result = majorityElement(nums);
        // System.out.println("Majority Elements (> n/3): " + result);

        hard obj = new hard();

        // int[] nums = {1, 0, -1, 0, -2, 2};
        // int target = 0;

        // // Call the function
        // List<List<Integer>> result = obj.fourSum(nums, target);

        // // Print the results
        // System.out.println("Input Array: " + Arrays.toString(nums));
        // System.out.println("Target: " + target);
        // System.out.println("Quadruplets that sum to target:");

        // for (List<Integer> quad : result) {
        //     System.out.println(quad);
        // }


        int[] nums = {0, 1, 2, 3, 4};
        int[][] queries = {{3, 1}, {1, 3}, {5, 6}};

        int[] result = obj.maximizeXor(nums, queries);
        System.out.println("\nFinal Result: " + Arrays.toString(result));
    }
}
