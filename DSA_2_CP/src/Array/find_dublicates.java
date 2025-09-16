package Array;

import java.util.HashSet;

//https://leetcode.com/problems/find-the-duplicate-number/description/
//Input: nums = [1,3,4,2,2]
//Output: 2
public class find_dublicates {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findduplicates3(nums));

    }
    public static int findduplicates(int[] nums){
        int n = nums.length;
        for(int i  = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;

    }
    public static int findduplicates2(int[] nums){
        HashSet<Integer> res = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n; i++ ){

             if(res.contains(nums[i])){
                 return nums[i];
             }else{
                 res.add(nums[i]);
             }
        }
        return -1;

    }
    public static int findduplicates3(int[] nums){
        int slow = nums[0], fast = nums[0] ;
        do{
            slow = nums[slow];
            fast =nums [nums[fast]];

        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];//+1
            fast = nums[fast];//+1

        }
        return slow;

    }
}
