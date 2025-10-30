package Array;
//You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].
//
//Note : A subarray is a continuous part of an array.
//
//Examples:

//Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//Output: 11
//Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
//Input: arr[] = [-2, -4]
//Output: -2
//Explanation: The subarray [-2] has the largest sum -2.
public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + Kadanes_algo(arr));

    }

    public static int Kadanes_algo(int arr[]) {
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            currsum+=arr[i];
            maxsum = Math.max(currsum, maxsum);
            if(currsum<0){
                currsum = 0;
            }
        }
        return maxsum;

    }
    public int max_sumarray(int[] nums){
        int n = nums.length;
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            currsum += nums[i];
            maxsum = Math.max(maxsum, currsum);
            if(currsum<0){
                currsum = 0;
            }
        }
        return maxsum;
    }
}
