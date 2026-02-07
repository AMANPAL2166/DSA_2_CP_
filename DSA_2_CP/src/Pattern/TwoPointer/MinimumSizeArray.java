package Pattern.TwoPointer;

import java.util.Arrays;

public class MinimumSizeArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;


    }

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }
}
