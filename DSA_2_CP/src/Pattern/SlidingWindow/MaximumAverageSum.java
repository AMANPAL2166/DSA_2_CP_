package Pattern.SlidingWindow;

public class MaximumAverageSum {
    public  static double findMaxAverage(int[] nums, int k) {
        int n = nums.length-1;
        if(k==1){
            int max = nums[0];
            for(int i = 1; i<n; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
            return (double)max/k;
        }
        int sum = 0;
        for(int i = 0;i<k  ;i++){
            sum += nums[i];

        }
        int maxSum = sum;
        for(int j = k; j<=n;j++){
            sum = sum - nums[j-k] + nums[j];
            maxSum = Math.max(maxSum, sum);
        }


        return (double) maxSum/k;

    }

    public static void main(String[] args) {
        int[] arr = {0,4,0,3,2};
        System.out.println(findMaxAverage(arr,1));

    }
}
