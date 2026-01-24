package Daily_Question;

import java.util.Arrays;

public class First {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);              // step 1
        int i = 0, j = nums.length - 1;
        int maxSum = 0;

        while (i < j) {                 // step 4
            int pairSum = nums[i] + nums[j];
            maxSum = Math.max(maxSum, pairSum);
            i++;
            j--;
        }
        return maxSum;                  // step 5
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
