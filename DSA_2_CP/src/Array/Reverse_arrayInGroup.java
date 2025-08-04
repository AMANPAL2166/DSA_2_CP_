package Array;
//Given an array arr[] of positive integers. Reverse every sub-array group of size k.
//Note: If at any instance, k is greater or equal to the array size, then reverse the entire array.
//Reverse 3 group of element
//Ex -- {2,4,4,7,2,8,4,8}  size of array is 8 then reverse first 3 group of element  -- after reverse {4,4,2,7,2,8,4,8} then move second 3element of group --{4,4,2,8,2,7,4,8} then again reverse 3group of element but this time
// we've only 2 element left in array soo we can only reverse last 2 element after reverse -{4,4,2,8,2,7,8,4}
// https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
public class Reverse_arrayInGroup {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7};
        int k = 5;
        reverseInGroup(k,arr);
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
    static  void reverseInGroup(int k, int[]  arr){
        int n = arr.length;
        for(int i = 0; i<n; i+=k){
            int left = i;
            int right =  Math.min(i+k-1 ,n-1);

            //Reverse the subarray
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            }
        }
    }

}
