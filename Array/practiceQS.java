package Array;

public class practiceQS {
    public  static boolean containsDuplicate(int number []){
        for(int i = 0; i< number.length-1; i++){
            for(int j = i+1; j< number.length ; j++){
                if (number[i] == number[j]) {
                   return true;
                }
            }
        }   
        return  false;
    }

    public static int cpAndSp(int price[]){
        int buy = price[0];
        int maxprofit = 0;
        for (int i = 1; i <price.length ; i++){
            int sellingPrice = price[i];
            int Profit = sellingPrice - buy;
            
            if (buy < sellingPrice) {
                maxprofit = Math.max(maxprofit, Profit);
            }
            else{
                buy = sellingPrice;
            }
            if (maxprofit < 0) {
                return 0;
            }
            System.out.println("the profit is = "+ maxprofit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        // int number [] = {1, 1, 1};
        // System.out.println(containsDuplicate(number));

        int price [] = {7, 6, 4,  3, 1};
        System.out.println("the total profit is = "+ cpAndSp(price) );
    }
}
