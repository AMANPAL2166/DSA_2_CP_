package Array;
//Given an array arr[] denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
//
//Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
//
//Examples:
//
//Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
//Output: 865
//Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865
public class Stock_Buy_sell {
//    public int stock_buy_sell(int arr[]){
//        int n = arr.length;
//        int buy = 0;
//        int sell = 0;
//        int count = 0;
//
//    }
      public static void main(String[] args) {
          Stock_Buy_sell obj = new Stock_Buy_sell();
          int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
          System.out.println(obj.stock_buy_int(arr));

       }
       // Acculate profit method
       public int stock_buy_int(int arr[]){
          int res = 0;
          for(int i = 1; i<arr.length; i++){
              if(arr[i]>arr[i-1]){
                  res+= arr[i]-arr[i-1];
              }
          }
          return res;
       }
       // Maxima Minima  method
      public int stock_buysell(int prices[] ){
          int n = prices.length;
          int max = prices[0];
          int min = prices[0];
          int res = 0;
          int i = 0;
          while(i<n-1) {
             //Find local minima
              while(i<n-1 && prices[i]>=prices[i+1]){ i++;}
              min=prices[i];
              // find local maxima
              while(i<n-1 && prices[i]<=prices[i+1]) {i++;}
              max=prices[i ];
              //Add current profit
              res +=(max-min);
          }
          return res;

      }
}

