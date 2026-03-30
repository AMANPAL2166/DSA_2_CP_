package NEETCODE.SLIDING_WINDOW;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {///  Brute force approach
        int[] ans= new int[(nums.length-k)+1];
        for(int i = 0;i<nums.length-k+1;i++){
            int max = nums[i];
            int j= i+1;
            while(j<k+i){
                if(nums[j]>max){
                    max = nums[j];
                }
                j++;
            }
            ans[i] = max;
        }
        return ans;

    }
    public static int[] maxSlidingWindow_2(int[] nums, int k) {///  Optimized  approach with Deque
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int idx = 0;

        for(int i = 0; i < nums.length; i++){

            // remove out of window
            if(!dq.isEmpty() && dq.peekFirst() == i - k){
                dq.pollFirst();
            }

            // remove smaller elements
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            // store result
            if(i >= k - 1){
                res[idx++] = nums[dq.peekFirst()];
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1};
        int[] ans = maxSlidingWindow(arr,1);
        for(int i = 0;i<ans.length;i++){
            System.out.println(ans[i] +" ");
        }
    }
}
