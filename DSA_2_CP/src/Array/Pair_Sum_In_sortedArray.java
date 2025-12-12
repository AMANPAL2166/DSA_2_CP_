package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Pair_Sum_In_sortedArray {
    public static void main(String[] args) {
        int[] arr = {3,1,3,7,8,0};
        int target = 2;
        System.out.println(pairInSortedRotated_1(arr, target));

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
}
