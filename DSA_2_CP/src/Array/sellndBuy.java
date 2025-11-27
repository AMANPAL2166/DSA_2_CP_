package Array;

import java.util.Arrays;

public class sellndBuy {

    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i<prices.length-1; i++){
            if(prices[i]>prices[i+1]){
                continue;
            }
            for(int j = i; j<prices.length; j++){
                int get = prices[j] - prices[i];
                if(get>max){
                    max = get;
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(Arrays.toString(arr));
        System.out.println(stock(arr));
    }

    public static int stock(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;
        for(int i =1; i<prices.length; i++){
            maxprof = Math.max(maxprof, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }
        return maxprof;
    }

}
