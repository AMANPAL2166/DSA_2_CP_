package NEETCODE.LINKED_LIST;

import java.util.HashSet;

public class FindDuplicates {
    public static int findDuplicate(int[] nums) {
        ///  But this isn't propiate answer, because it's using O(n) space complexity and we can do  it in a constant using Linkedlist Floyd's Cycle-Finding.
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return nums[i];
            }else{
                ans.add(nums[i]);
            }
        }
        return -1;
    }

    public static int findDuplicates(int[] nums) {
        // Phase 1: Finding the intersection point in the cycle
        int tortoise = nums[0];
        int hare = nums[0];

        do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }while(tortoise != hare);
        //Phase 2: Finding the entrance to the cycle (the duplicate)
        tortoise = nums[0];
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }
}
