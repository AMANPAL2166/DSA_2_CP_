package Pattern.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

    public static void main(String[] args) {
        int[] arr = {1,11,9,5,7};
        System.out.println(nextGrePrev(arr));
    }
}
