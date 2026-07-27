package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class subsetSum {
    public static List<Integer> subsetSumm(int[] nums){
        List<Integer> ans = new ArrayList<>();
        ansFunction(nums, 0, 0, ans);
        return ans;
    }

    private static void ansFunction(int[] nums, int ind, int currSum, List<Integer> ans) {
        //base case
        if(ind == nums.length){
            ans.add(currSum);
            return;
        }
        //include
        ansFunction(nums, ind+1, currSum+nums[ind], ans);
        //exclude
        ansFunction(nums, ind+1, currSum, ans);
    }

    public static void main(String[] args) {
        //int[] arr =
    }
}
