package NEETCODE.GREEDY;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        //Initialize a maxReach variable
        //Iterate to the length of nums
        //check if i>maxReach return false
        //update maxReach
        int maxReach = 0;
        for(int i= 0;i<nums.length;i++){
            if(i>maxReach) return false;
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 1, 2};
        System.out.println(canJump(nums));
    }
}
