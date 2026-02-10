package Pattern.SlidingWindow;

import java.util.Arrays;

public class SlidingwindowMaximum {
    public  static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for(int  i = 0; i<=nums.length-k;i++){
            int max = nums[i];
            int j = i+1;
            while(j<k+i){
                if(nums[j] >max){
                    max = nums[j];
                }
                j++;
            }
            ans[i] = max;
        }
        return ans ;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3))  );
    }
}
