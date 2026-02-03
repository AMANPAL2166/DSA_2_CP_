package Pattern.TwoPointer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Twosum {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] ans = new int[2];
        while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                 ans[0] =  start+1;
                 ans[1] = end+1;
            }
            if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[]arr = {5,25,75};
        int target = 9;
        System.out.println(twoSum(arr,target));
    }
}
