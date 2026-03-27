package NEETCODE.TWO_POINTERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //3 sum is not a problem of 3 pointer, it's all about sort array and fix i
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            //check duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    //check duplicates
                    while(j<k && nums[j]== nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1])k--;
                    j++;
                    k--;


                }
                if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] ans = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(ans));
    }

}
