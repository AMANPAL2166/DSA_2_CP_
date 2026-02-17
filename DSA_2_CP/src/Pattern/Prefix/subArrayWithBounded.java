package Pattern.Prefix;

import java.util.Date;



public class subArrayWithBounded {
//    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
//        int count = 0;
//
//        for(int i = 0;i<nums.length;i++){
//            int sum=0;
//            for(int j = i;j<nums.length;j++){
//                sum+= nums[j];
//                if(sum>= left && sum <=right){
//                    count++;
//                }else{
//                    i=j;
//                    break;
//                }
//
//            }
//        }
//        return count;
//
//    }


    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        System.out.println(numSubarrayBoundedMax(nums, 2,3));
    }

    private static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right)-count(nums, left-1);
    }
    private static  int count(int[]nums, int bound){
        int count= 0;
        int ans= 0;
        for(int num: nums){
            if(num <bound){
                count++;
                ans += count;
            }else{
                count=0;
            }
        }
        return ans;
    }
}
