package NEETCODE.GREEDY;

import java.util.Arrays;

public class FractionalKnapsack {
    //need to make a class called item
    static class item{
        int val, wt;
        item(int val, int wt){
            this.val = val;
            this.wt = wt;
        }
    }
    public static double knapsack(int[] val, int[] wt, int cap){
        //Make a item object and push all the value of wt and cap
        //then sort item by weight-value in descending order
        int n = val.length;
        item[] items = new item[n];
        for(int i = 0;i<n;i++){
            items[i] = new item(val[i], wt[i]);
        }
        Arrays.sort(items,(a,b)->
            Double.compare((double) b.val/b.wt, (double)a.val/a.wt)
        );
        //Initialize a maxCap;
        //Iterate through the weight
        //Condition: if wt[i] <cap, then directly add to maxCap
        //Else: crate a remainCap = (1/cap)* val[i] and add to maxCap
        //return maxCap
        double maxCap = 0.0;
        for(int i = 0;i<n;i++){
            if(items[i].wt <=cap){
                maxCap+= items[i].val;
                cap -= items[i].wt;
            }else{
                  double fraction = (double) cap/items[i].wt;
                  maxCap+= fraction*items[i].val;
                 break;
            }
        }
        return maxCap;

    }

    public static void main(String[] args) {
        int[] val = {100,280,120,120};
        int[] wt = {10,40,20,24};
        System.out.println(knapsack(val,wt,60));
    }
}
