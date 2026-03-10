package Pattern.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmaller {
    public static ArrayList<Integer> lastSmaller(int[] nums) {
        //create arrayList to store ans, initialize with -1
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(nums.length,-1));
        //traverse from left to right
        for(int i = 1;i<nums.length;i++){
            for(int j = i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    ans.set(i,nums[j]);
                    break;
                }
            }
        }
        return ans;
    }
    public static ArrayList<Integer> lastSmaller_2(int[] nums) {
        //create arrayList to store ans, initialize with -1
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(nums.length,-1));
        //use stack to store value
        Stack<Integer> st = new Stack<>();
        //traverse from left to right
        for(int i = 0;i<nums.length;i++){
            //check, is stack empty. If no then pop till the small element
             while(!st.isEmpty() && st.peek()>= nums[i]){
                 st.pop();
             }
             //if peek is less then nums[i] set as answer
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            //push the current element
            st.push(nums[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4,8};
        System.out.println("Brute: "+lastSmaller(nums));
        System.out.println("Optimized: " + lastSmaller_2(nums));
    }
}
