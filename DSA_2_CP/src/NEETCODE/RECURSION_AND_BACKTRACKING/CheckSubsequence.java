package NEETCODE.RECURSION_AND_BACKTRACKING;

public class CheckSubsequence {
    public static boolean checkSub(int[] nums, int k) {
        return helper(nums, k, 0, 0);
    }

    public static boolean helper(int[] nums, int k, int index, int curr) {
        //base case
        if(index == nums.length){
            return curr == k;
        }
        boolean exclude = helper(nums, k, index+1, curr);
        boolean include = helper(nums, k, index+1, curr+nums[index]);
        return exclude||include;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(checkSub(nums, 3));
    }
}
