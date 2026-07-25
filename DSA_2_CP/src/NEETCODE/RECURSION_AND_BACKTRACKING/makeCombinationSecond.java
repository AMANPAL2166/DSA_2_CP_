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
            // Skip duplicates to avoid repeating combinations
            if (i > ind && candidates[i] == candidates[i - 1]) continue;

            // If the current element is greater than the remaining target, break the loop
            if (candidates[i] > target) break;

            // Include the current element in the combination
            currentCombination.add(candidates[i]);

            // Recur with the updated target and next index (i + 1 to avoid repetition)
            backtrack(candidates, target - candidates[i], ans, ind+1, currentCombination);

            // Backtrack by removing the last added element
            currentCombination.remove(currentCombination.size() - 1);
        }

    }
}
