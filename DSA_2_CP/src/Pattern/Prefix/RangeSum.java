package Pattern.Prefix;

public class RangeSum {
    public static int rangeSum(int[] nums, int left, int right){
        int sum = 0;
        for(int i = left; i<right; i++ ){
            sum+= nums[i];
        }
        return sum;
    }//In this method, we are using O(n).
    //Now we are going to use Prefix pattern to solve same problem into O(n);
    static int[] prefix;
    public static  void rangeSumm(int[] nums){
         prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    public static int sum(int left, int right){
        if(left == 0){
            return prefix[right];
        }else{
            return prefix[right]-prefix[left-1];
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(rangeSum(nums, 0, 4));
    }
}
