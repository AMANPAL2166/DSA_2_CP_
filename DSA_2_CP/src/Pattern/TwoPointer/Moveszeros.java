package Pattern.TwoPointer;

import java.sql.Array;
import java.util.Arrays;

public class Moveszeros {
    public static void moveZeroes(int[] nums) {
         //Initialize slow to track 0's.
        int slow = 0;
        for(int fast = 0;fast<nums.length;fast++){
            if(nums[fast] != 0){
                //swap
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
       moveZeroes(arr);
    }
}
