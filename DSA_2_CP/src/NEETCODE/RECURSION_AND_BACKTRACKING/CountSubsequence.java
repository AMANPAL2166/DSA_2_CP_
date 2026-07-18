package NEETCODE.RECURSION_AND_BACKTRACKING;

public class CountSubsequence {
    public static int countSequence(int[] nums, int sum) {
        return helper(nums,0,3,0);
    }

    public static int helper(int[] nums, int index, int sum,int curr ) {
        //base case
        if(index== nums.length){
            if(curr == sum){
                return 1;
            }
            return 0;
        }
        //decision1: exclude
        int exclude = helper(nums, index+1, sum, curr);

        //decision 2: include
        int include = helper(nums, index+1, sum, curr+nums[index]);
        return include+exclude;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(countSequence(nums,3));
    }

}
