package NEETCODE.STACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class Maximum_Histogram {
    public static int largestRectangleArea(int[] heights) {
        ArrayList<Integer> NSL = NSL(heights);
        ArrayList<Integer> NSR = NSR(heights);
        int maxArea = 0;
        for(int i = 0;i<heights.length;i++){
            int width = NSR.get(i) - NSL.get(i)  -1;
            int area  =  heights[i] * width;
            maxArea  = Math.max(maxArea, area);
        }
        return maxArea;


    }
    static ArrayList<Integer> NSL(int[] height){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(height.length,-1));
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(i);
        }
        return ans;
    }
    static ArrayList<Integer> NSR(int[] height){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(height.length,height.length));
        Stack<Integer> st = new Stack<>();
        for(int i = height.length-1;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
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
        int[] arr = {2,4};
        System.out.println(largestRectangleArea(arr));
    }
}
