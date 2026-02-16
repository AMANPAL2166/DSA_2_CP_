package Pattern.Prefix;

public class minSizeSubarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
             int sum = 0;
             for(int j= i ; j<nums.length;j++){
                 sum += nums[j];
                 if(sum >=target){
                     count  = Math.min(count, j-i+1);
                     break;
                 }
             }
         }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(3, arr));
    }
}
