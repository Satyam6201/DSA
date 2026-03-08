package Array;

public class TrappingWater {
    public static int TrapWater(int height[]){
        int n = height.length;

        // Calculater Left Bound -(in array)

        int leftMax [] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i< n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculater Right Bound -(in array)

        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2 ; j>= 0; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        int trapWater = 0;

        // loop

        for(int k = 0; k< n ; k++){

            // waterlevel = min (leftmax bound , right bound)
            int waterlevel = Math.min(leftMax[k], rightMax[k]);
            
            // trapwater += waterlevel - height[k]
            trapWater += waterlevel - height[k];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        System.out.println(TrapWater(height));
    }
}
