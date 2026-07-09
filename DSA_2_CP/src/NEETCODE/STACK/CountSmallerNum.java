package NEETCODE.STACK;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNum {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int countSum = 0;
        for(int i = 0;i<nums.length;i++){

            //inner loop
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    countSum++;
                }
            }
            ans.add(countSum);
            countSum = 0;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        List<Integer> ans = countSmaller(nums);

    }
}
