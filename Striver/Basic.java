
import java.util.Arrays;


public class Basic {
    public void studentGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        }

        else if (marks >= 70) {
            System.out.println("Grade B");
        }

        else if (marks >= 50) {
            System.out.println("Grade C");
        }

        else if (marks >= 35) {
            System.out.println("Grade D");
        }

        else {
            System.out.println("Fail");
        }
    }

    public static int largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int secondLargest(int nums[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i< nums.length; i++) { // first largest
            if (nums[i] > firstLargest) {
                firstLargest = nums[i];
            }
        }

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] < firstLargest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();
        // Basic obj = new Basic();
        // obj.studentGrade(marks);
        // sc.close();

        // int nums[] = {3, 5, 11, 6, 1};
        // System.out.print(largestElement(nums));

        // System.err.println(secondLargest(nums));

        // import java.util.Arrays;

// public class SecondLargestShortcut {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 41, 31, 10};
        Arrays.sort(arr);
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }
}
// }

//     }
// }

