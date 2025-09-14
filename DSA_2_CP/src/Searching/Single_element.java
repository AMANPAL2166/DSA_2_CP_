package Searching;

public class Single_element {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNonDuplicate1(nums));

    }

    public static int singleNonDuplicate1(int[] nums) {// using linear search
        int n = nums.length;
        if (n < 1) {
            return nums[0];
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                i++;
            } else {
                return nums[i - 1];
            }
        }
        return nums[n - 1];
    }

    public static int singleNonDuplicate2(int[] nums) {
        // using Binary search
        int n = nums.length;
        if(n<1){
            return nums[0];
        }
        int st = 0, end = n-1;

    }

}
