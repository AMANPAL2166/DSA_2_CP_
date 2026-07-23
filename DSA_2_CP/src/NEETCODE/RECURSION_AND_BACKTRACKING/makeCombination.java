package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class makeCombination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remainingTarget, int startIdx, List<Integer> currentCombination, List<List<Integer>> result) {
        // Base Case 1: Target achieved
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Base Case 2 & 3: Out of bounds or target exceeded
        if (remainingTarget < 0 || startIdx == candidates.length) {
            return;
        }

        // Option 1: Include candidates[startIdx]
        currentCombination.add(candidates[startIdx]);
        // Stay at startIdx because we can reuse the same element
        backtrack(candidates, remainingTarget - candidates[startIdx], startIdx, currentCombination, result);

        // Backtrack (remove the element to explore Option 2)
        currentCombination.remove(currentCombination.size() - 1);

        // Option 2: Skip candidates[startIdx] and move to the next candidate
        backtrack(candidates, remainingTarget, startIdx + 1, currentCombination, result);
    }
}
