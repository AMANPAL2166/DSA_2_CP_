package Pattern.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterFirst {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int ele = nums1[i];
                    while(j<nums2.length){
                        if(nums2[j]>ele){
                            ans[i] = nums2[j];
                            break;
                        }else{
                            ans[i] =-1;
                        }
                        j++;
                    }
                }
            }
        }System.out.print ("[");
        for(int  i = 0;i<ans.length;i++){

            System.out.print (ans[i]+",");

        }System.out.print ("]");

        return ans;

    }
    public static int[] nextGreaterOPT(int[] nums1, int[] nums2){
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i< nums2.length;i++){
            st.push(nums2[i]);
        }

    }

    public static void main(String[] args) {
        int[] nums1  = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2));
    }
}
