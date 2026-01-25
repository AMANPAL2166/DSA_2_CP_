package Daily_Question;

import java.util.Arrays;

public class Minimumdifference {
    //You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
    //
    //Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
    //
    //Return the minimum possible difference.
    public static int minimumDifference(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for(int i = 0;i<=n-k;i++){
            int diff = nums[i+k-1] - nums[i];
            min = Math.min(min,diff);
        }

        return min;


    }

    public static void main(String[] args) {
        int[] nums = {9,2,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums, k));

    }
}
