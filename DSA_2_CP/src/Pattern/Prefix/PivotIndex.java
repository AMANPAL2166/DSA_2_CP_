package Pattern.Prefix;

import java.util.Arrays;

public class PivotIndex {
    public  static int pivotIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum =0;
            //this loop run for leftSum
            for(int j= 0; j<i;j++){
                leftSum+= nums[j];
            }//this loop for rightSum
            for(int j = i+1; j<nums.length;j++){
                rightSum+= nums[j];
            }
            //This is checking
            if(leftSum == rightSum){
                return i;
            }

        }
        return -1;

    }
    public  static int pivotIndexOPT(int[] nums) {
         //Store all the prefix;

         int total = 0;
         for(int num: nums){
             total+=num ;
         }
         int leftSum  = 0;
         for(int i = 0; i<nums.length;i++){
             int rightSum = total -leftSum-nums[i];
             if(rightSum==leftSum){
                 return i;
             }
             leftSum+= nums[i];
         }
         return -1;


    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println("Brute  "+pivotIndex(arr));
        System.out.println("Opt::"+pivotIndexOPT(arr));
    }
}
