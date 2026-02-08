package Pattern.TwoPointer;

import java.util.Arrays;

public class sortColor {
    public static void sortColors(int[] nums) {
        //Although this is working method but not recomment on interview:::::
        int[] ans = new int[nums.length];
        int idx  = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 0) {
                ans[idx] = nums[i];
                idx++;
            }

        }
        idx = idx;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 1){
                ans[idx] = nums[i];
                idx++;
            }
        }
        idx = idx;

        for(int i = 0; i<nums.length ;i++){
            if(nums[i] == 2){
                ans[idx] = nums[i];
                idx++;
            }
        }
        for(int i = 0; i<nums.length;i++){
            nums[i]= ans[i];
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }
}
