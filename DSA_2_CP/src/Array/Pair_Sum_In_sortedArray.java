package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Pair_Sum_In_sortedArray {
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;
        System.out.println(pairInSortedRotated_2(arr, target));

    }

    public static boolean  pairInSortedRotated(int[] arr, int target) {
        ArrayList<Integer> Array = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= target){
                continue;
            }else{
                Array.add(arr[i]);
            }
        }
        int left = 0, right = Array.size()-1;
        while(left<right){
            int sum = Array.get(left) + Array.get(right);
            if(sum == target){
                return true;
            } else if (sum<target) {
                left = left+1;

            }else{
                right = right-1;
            }

        }
        return  false;


    }

    public static boolean pairInSortedRotated_1(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            //find difference between arr[i] to target
            int difference = target -arr[i];
            //Check if the difference exist in the set
            if(set.contains(difference)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    /// / Optimized method
    public static boolean pairInSortedRotated_2(int[] arr, int target) {
        int n = arr.length;
        //find the pivot element
        int i;
        for(i = 0 ;i<arr.length; i++){
            if(arr[i] > arr[i+1]);
            break;
        }
        //l is now index of smallest element
        int l = (i+1) %n;
        // r is now index of largest element
        int r = i;
        //keep moving either l or r till they meet
        while(l != r){
            // If we find  a pair with sum target, return here
            if(arr[l] + arr[r] == target){
                return true;
            }
            //If current pair sum is less, move to higher sum
            if(arr[l] +arr[r] < target){
                l = (l+1)%n;
            }
            //move to lower sum side
            else {
                r = (r -1+n)%n;
            }

        }return false;

    }
}
