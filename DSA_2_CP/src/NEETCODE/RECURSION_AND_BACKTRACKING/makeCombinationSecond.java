package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class makeCombinationSecond {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //sort array to deal with duplicates
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, ans,0,  new ArrayList<>());
        return ans;

    }
    public void backtrack(int[] candidates, int target, List<List<Integer>> ans, int ind, List<Integer> currentCombination){
        if(target== 0){
            ans.add(new ArrayList<>(currentCombination));
            return;
        }
        //iterate to the loop start from index
         for(int i = ind;i<candidates.length;i++){
             //skip duplicates
             if(i>0 && candidates[i] == candidates[i-1]) continue;
             //if current element is greater than target
             if(candidates[i]> target) break;
             //Include the current ele
             currentCombination.add(candidates[i]);
             //recure with the updated
             backtrack(candidates, target-candidates[i], ans , i+1,currentCombination );
             //backtrack by removing the last added element
             currentCombination.remove(currentCombination.size()-1);

         }

    }

    public static void main(String[] args) {
        int[] candidate  = {1,2,3,4};
    }
}
