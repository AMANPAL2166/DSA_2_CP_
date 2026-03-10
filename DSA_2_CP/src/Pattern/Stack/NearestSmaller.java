package Pattern.Stack;

import java.util.ArrayList;
import java.util.Collections;

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

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4,8};
        System.out.println(lastSmaller(nums));
    }
}
