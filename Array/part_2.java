package Array;

public class part_2 {
    
    // Max sum value :- (brute force)

    public static void MaxSumSubArray(int number[]){
        int currentSum = 0;
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <=end; k++) {
                    currentSum += number[k];
                }
                System.out.print(currentSum + " ");
                if (max_value < currentSum) {
                    max_value = currentSum;
                }
            }
        }
        System.out.println("max value is = " + max_value);
    }

    // prifix sum:-

    public static void MaxSumSubArrays(int number[]){
        int currentSum = 0;
        int max_value = Integer.MIN_VALUE;

        int prefix[]= new int [number.length];
        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                currentSum = start ==0 ? prefix[end]: prefix[end] - prefix[start-1];
                if (max_value < currentSum) {
                    max_value = currentSum;
                }
            }
        }
        System.out.println("Maximum sum of the number is = " + max_value);
    }

    // kadane's method:-

    public static void MaxsubArray(int number[]){
        int currentSum= 0;
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            currentSum = currentSum + number[i];

            if (currentSum < 0) {
                currentSum = 0;
            }
            max_value = Math.max(currentSum , max_value);
        }
        System.out.println("The maximum value is = " + max_value);
    }
    
    public static int TrappingRainWAter(int height[]){
        int n = height.length;

        // left max boundary
        int leftMax [] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i< n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Right max boundary:-
        
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2; j>= 0; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        // Trapping rain water:-

        int Trappingwater = 0;

        for(int i = 0; i< n ; i++){
            int Rainlevel = Math.min(leftMax[i], rightMax[i]);
            Trappingwater += Rainlevel - height[i];  // to calculate trappping water 
        }
        return Trappingwater;
    }

    public static int BuyAndCell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < price.length; i++) {
            int sellingPrice = price[i];
            if (buyPrice < sellingPrice) {
                int profit = sellingPrice - buyPrice ;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = sellingPrice;
            }
            // System.out.println("Daily profit is = " + maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int number [] = {2,4,6,8};
        MaxSumSubArray(number);
        // MaxSumSubArrays(number);

        // int number [] = {-2,-3,4,-1,-2,1,5,-3};
        // MaxsubArray(number);

        // int height [] = {4,2,0,6,3,2,5};
        // System.out.println("The total trapping rain water is = " + TrappingRainWAter(height));
        
        // int price []= {7,1,5,3,6,4} ;
        // System.out.println("\nTotal profit is = "+BuyAndCell(price));
    }
}
