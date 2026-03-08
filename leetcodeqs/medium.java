package leetcodeqs;

public class medium {
    public static int maxArea(int [] height){
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while (left<right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right-left;
            maxArea = Math.max(maxArea, minHeight*width);

            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
