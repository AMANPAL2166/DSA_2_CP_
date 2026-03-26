package NEETCODE.Arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
//       //Brute force
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;int locCount = 1;
        for(int i = 1;i<nums.length;i++){
            //skip duplicates
            if(nums[i] == nums[i-1]) continue;

            if(nums[i] == nums[i-1]+1){
                locCount++;
            }else{
                count = Math.max(count, locCount);
                locCount = 1;


            }
           count = Math.max(count,locCount);

        }
        return count;


    }
    public static int longestConsecutive_2(int[] nums) {
//       Sab elements set me daal do
//Sirf tab start karo jab:
//num-1 exist na kare
//
//👉 Matlab: sequence ka starting point
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num: set){
            //start of sequence
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest = Math.max(longest,count);

            }

        }
        return longest;



    }


    public static void main(String[] args) {
        int[] nums= {1,2,6,7,8};
        System.out.println(longestConsecutive_2(nums));

    }
}
