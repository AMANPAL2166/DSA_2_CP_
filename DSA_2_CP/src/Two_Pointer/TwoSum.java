package Two_Pointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1} ;
        int target = -1;
        System.out.println(twoSum(arr,target));

    }
    static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum == target){
                return true;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return false;

    }
}
