package Pattern.Prefix;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == k){
                count++;
            }
            int sum = nums[i];
            for(int j = i+1;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(subarraySum(arr,3));
    }
}
