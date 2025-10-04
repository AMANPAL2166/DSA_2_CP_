package Fundamental;

import java.util.ArrayList;
import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] nums = {3,4,3,5,67,2};
        System.out.println(Arrays.toString(sortArray(nums)) );

    }
    public static int[] sortArray(int[] nums) {//In this method time limit exceed
        int n = nums.length;
        boolean swapped;
        // Repeat passes until no swaps
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return nums;
    }



}
