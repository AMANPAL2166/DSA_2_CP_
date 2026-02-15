package Pattern.Prefix;

public class BinarySubarraySum {
    public static  int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        //loop to check goal == nums[i];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == goal){
                count++;
            }
        }
        for(int i = 0; i< nums.length;i++){
            int sum = nums[i];
            for(int j = i+1; j<nums.length;j++){
                sum += nums[j];
                if(sum>goal){//Only for binary array???
                    break;
                }
                if(sum== goal){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(numSubarraysWithSum(arr,0));
    }
}
