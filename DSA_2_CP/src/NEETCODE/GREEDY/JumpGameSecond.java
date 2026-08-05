package NEETCODE.GREEDY;

public class JumpGameSecond {
    public static int canJump(int[] nums) {
        //Initialize a maxReach variable
        //Iterate to the length of nums
        //check if i>maxReach return false
        //update maxReach
        int maxReach = 0;
        int jump = 0;
        int curenEnd= 0;
        for(int i= 0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(i == curenEnd){
                jump++;
                curenEnd = maxReach;
            }

        }
        return jump;

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(canJump(nums));
    }

}
