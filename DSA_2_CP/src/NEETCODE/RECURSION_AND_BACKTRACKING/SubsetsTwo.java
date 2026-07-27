package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTwo {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helperFuc(nums,0,  new ArrayList<>(), ans);
        return ans;
    }

    private void helperFuc(int[] nums, int ind, List<Integer> currEle, List<List<Integer>> ans) {
        //base case
        ans.add(new ArrayList<>(currEle));
        for(int i = ind;i<nums.length;i++){
            //deal with duplicates
            if(i>ind && nums[i] == nums[i-1])continue;
            currEle.add(nums[i]);
            helperFuc(nums, i+1, currEle, ans);
            currEle.remove(currEle.size()-1);

        }
    }
}
