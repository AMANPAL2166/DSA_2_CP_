package Leetcode_Contest.JAN_CONTEST.July.third186;

import java.util.Arrays;

public class UniqueMiddle {
    public static boolean isMiddleElementUnique(int[] nums) {
        //edge  case
        if(nums.length == 1) return true;
//        Arrays.sort(nums);
        int low = 0;
        int high = nums.length;
        int mid = low+(high-low)/2;
        //conditon
        if(nums[mid] == nums[mid+1] || nums[mid] == nums[mid-1]) return false;
        for(int i = 0;i<nums.length;i++){
            if(i== mid) continue;
            if(nums[mid] == nums[i]){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(isMiddleElementUnique(nums));
    }
}
