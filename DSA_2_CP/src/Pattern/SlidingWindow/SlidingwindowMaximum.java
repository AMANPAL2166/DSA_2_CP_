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
    public  static int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int max = Integer.MIN_VALUE;

        // first window
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        ans[0] = max;

        for (int i = 1; i <= n - k; i++) {

            int out = nums[i - 1];
            int in = nums[i + k - 1];

            if (out == max) {
                // MUST recompute
                max = nums[i];
                for (int j = i; j < i + k; j++) {
                    max = Math.max(max, nums[j]);
                }
            } else {
                // window changed → compare properly
                max = Math.max(max, in);
            }

            ans[i] = max;
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,-1};
        System.out.println(Arrays.toString(maxSlidingWindow2(nums,1))  );
    }
}
