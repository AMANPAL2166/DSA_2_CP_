package NEETCODE.SLIDING_WINDOW;
// find minimum and maximum of array
// check if minimum of i should be less than max of i;
public class BestBuySell {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(prices[i] > prices[j]) {
                    continue;
                }else{
                    int diff = prices[j] - prices[i];
                    max = Math.max(max, diff);
                }

            }

        }return max;
    }

    public static int maxProfit_2(int[] prices) {
        int minPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;
        for(int price: prices){
            if(price < minPrice){
                minPrice=price;
            }else{
                int profit = price- minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit_2(arr));
    }
}
