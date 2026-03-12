package Pattern.Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

/// 1️⃣ Find Next Smaller Element Left (NSL)
/// 2️⃣ Find Next Smaller Element Right (NSR)
/// 3️⃣ Width calculate:
///
/// width = right[i] - left[i] - 1
///
/// 4️⃣ Area:
public class LargestAreaHistogram {
    public static int largestRectangleArea(int[] heights) {
        ArrayList<Integer> NSL = NSL(heights);
        ArrayList<Integer> NSR = NSR(heights);

        int maxArea = 0;

        for(int i = 0; i < heights.length; i++) {

            int width = NSR.get(i) - NSL.get(i) - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;


    }
    public static ArrayList<Integer> NSL(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(nums.length, -1));
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(i);
        }
        return ans;
    }
    public static ArrayList<Integer> NSR(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(nums.length, nums.length));
        Stack<Integer> st = new Stack<>();
        for(int i = nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] heights = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(heights));
    }
}
