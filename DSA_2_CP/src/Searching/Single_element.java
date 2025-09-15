package Searching;

public class Single_element {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        System.out.println(singleNonDuplicate2(nums));

    }

    public static int singleNonDuplicate1(int[] nums) {// using linear search
        int n = nums.length;
        if (n == 1) {
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
        int n = nums.length;
        if(  n == 1){
            return nums[0];
        }
        if(n == 3){
            if(nums[0] == nums[1]){
                return nums[2];
            }else{
                return nums[0];
            }
        }
        int st = 1, end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid%2==0){
                //even check
                if(nums[mid] == nums[mid-1]){
                    end = mid-1;
                }else{
                    st = end+1;
                }

            }else{
                if(nums[mid] == nums[mid-1]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return nums[n-1];
    }
}
