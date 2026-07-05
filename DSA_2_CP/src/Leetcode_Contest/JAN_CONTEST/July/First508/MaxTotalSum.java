package Leetcode_Contest.JAN_CONTEST.July.First508;

import java.util.Arrays;
/// /Q3. Maximum Subarray Sum After Multiplier
/// Medium
/// 5 pt.
/// You are given an integer array nums and a positive integer k.
///
/// You must choose exactly one subarray of nums and perform exactly one of the following operations:
///
/// Multiply each number in the chosen subarray by k.
/// Divide each number in the chosen subarray by k.
/// When dividing a positive number by k, use the floor value of the division result.
/// When dividing a negative number by k, use the ceiling value of the division result.
/// Return the maximum possible sum of a non-empty subarray in the resulting array.
///
/// Note that the subarray chosen for the operation and the subarray chosen for the sum may be different.
///
///
///
/// Example 1:
///
/// Input: nums = [1,-2,3,4,-5], k = 2
///
/// Output: 14
///
/// Explanation:
///
/// Multiply each number in the subarray [3, 4] by 2.
/// This results in nums = [1, -2, 6, 8, -5].
/// The subarray with the largest sum is [6, 8], so the output is 6 + 8 = 14.
/// Example 2:
///
/// Input: nums = [-5,-4,-3], k = 2
///
/// Output: -1
///
/// Explanation:
///
/// Divide each number in the subarray [-3] by 2.
/// This results in nums = [-5, -4, -1].
/// The subarray with the largest sum is [-1], so the output is -1.
///
///
/// Constraints:
///
/// 1 <= nums.length <= 105
/// -105 <= nums[i] <= 105
/// 1 <= k <= 105
public class MaxTotalSum {
    public static long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        for(int i =nums.length-1;i>=nums.length-k;i--){
            //condition: if mul <1 then add normal nums[i]
            //agar nums[i] < 0 toh bhi direct sum me add kar do
            if(nums[i]<0){
                sum+= nums[i];
            }else{
                if(mul<1){
                    sum+= nums[i];
                }else{
                    //agar mul>1 then multiply with mul*i
                    long multiplyOfCurr = nums[i]*mul;
                    sum+= multiplyOfCurr;
                }
            }

            mul--;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums= {-5,-10,-3};
        System.out.println(maxSum(nums,2,2));
    }
}
