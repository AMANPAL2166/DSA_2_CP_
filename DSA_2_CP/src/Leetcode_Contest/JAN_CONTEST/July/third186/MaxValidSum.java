package Leetcode_Contest.JAN_CONTEST.July.third186;

public class MaxValidSum {
    public static int maxValidPairSum(int[] nums, int k) {
        //TLE
        ///  Q2. Maximum Valid Pair Sum
        /// Attempted
        /// Medium
        /// 4 pt.
        /// You are given an integer array nums of length n and an integer k.
        ///
        /// A pair of indices (i, j) is called valid if:
        ///
        /// 0 <= i < j < n
        /// j - i >= k
        /// Return the maximum value of nums[i] + nums[j] among all valid pairs.
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n-k;i++){
            int j= nums.length - 1;
            while (j - i >= k){
                int sum = nums[i] + nums[j];
                if(sum > max){
                    max = sum;
                }
                j--;
            }
        }
        return max;

    }
    public int maxValidPairSum_(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int maxLeft = Integer.MIN_VALUE;

        // Loop ko k se shuru karenge taaki piche kam se kam k ka gap ho
        for (int j = k; j < n; j++) {
            // Jaise-jaise j aage badhega, naya eligible element 'nums[j - k]' banta jayega
            maxLeft = Math.max(maxLeft, nums[j - k]);

            // Ab bas aaj tak ke sabse bade left element ko nums[j] ke sath jod do
            maxSum = Math.max(maxSum, maxLeft + nums[j]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums= {1,3,5,2,8};
        System.out.println(maxValidPairSum(nums, 2));

    }
}
