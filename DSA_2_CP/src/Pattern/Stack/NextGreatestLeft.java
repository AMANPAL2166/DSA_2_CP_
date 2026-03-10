package Pattern.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class NextGreatestLeft {
    public static ArrayList<Integer> nextGrePrev(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        for(int i= 1;i<nums.length;i++){
            ans.add(i,-1);
            for(int j  = i-1;j>=0;j--){
                if(nums[j]>nums[i]){
                    ans.set(i,nums[j]);
                    break;
                }
            }
        }
//        System.out.print ("[");
//        for(int i = 0;i<nums.length;i++){
//            System.out.print (ans[i]+",");
//        }
//        System.out.print ("]");

        return ans;
    }
    public static ArrayList<Integer> nextGrePrev_2(int[] nums){
         //Storing answer and initialize with -1
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(nums.length,-1));
        //create a stack to store important value
        Stack<Integer> st= new Stack<>();
        //iterate till the array.length
        for(int i =0;i<nums.length;i++ ){
            //check stack isempty or not, if not then pop till the greater element
            while (!st.isEmpty() && nums[i]>st.peek()){
                st.pop();
            }
            //check if st.peek is greater than nums[i] then store as ans
            if(!st.isEmpty()){
                ans.set(i, st.peek());
            }
            //ans push the current value to the stack
            st.push(nums[i]);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,11,9,5,7};
        System.out.println(nextGrePrev_2(arr));
    }
}
