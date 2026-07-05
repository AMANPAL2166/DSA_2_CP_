package Leetcode_Contest.JAN_CONTEST.July.Second509;

import java.util.Arrays;
//You are given an integer array nums.
//
//The digit range of an integer is defined as the difference between its largest digit and smallest digit.
//
//For example, the digit range of 5724 is 7 - 2 = 5.
//
//Return the sum of all integers in nums whose digit range is equal to the maximum digit range among all integers in the array.
//
//
//
//Example 1:
//
//Input: nums = [5724,111,350]
//
//Output: 6074

public class MaxdigitRange {
    public static int maxDigitRange(int[] nums) {
        int getMaxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int[] maxDig= new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            int temp = nums[i];
            //edge case:If number is 0, then check it seperatly
            if(temp == 0){
                getMaxNum= Math.max(getMaxNum, 0);
                minNum = Math.min(minNum, 0);
            }
            //run loop till the temp != 0
            while(temp > 0){
                //create mod so that we'll get last digit of number
                int mod = temp%10;
                //condition
                if(mod>getMaxNum){
                    getMaxNum = mod;
                }
                if(mod<minNum){
                    minNum = mod;
                }
                temp = temp/10;//so that we can we our pointer toword end

            }
            maxDig[i] = getMaxNum-minNum;
            getMaxNum = Integer.MIN_VALUE;;
            minNum = Integer.MAX_VALUE;
        }


        return  solver(nums,maxDig);

    }

    private static int solver(int[] nums, int[] maxDig) {
        int sum = 0;
        int maxRange =  0;
        for(int i: maxDig){
            if(i>maxRange){
                maxRange = i;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(maxDig[i] == maxRange){
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {90,900};
        System.out.println(maxDigitRange(nums));
    }
}
