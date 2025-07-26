//https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
package Array;

import java.util.Arrays;

public class FindSubarray {

    //This is bruteforce approach to solve findSubarray whose time and space compalaxity is (n^2)--
    //Formula of subarray = n(n+1)/2: ex= n == 4 then: 4(4+1)/2= 10 :: that means there are 10 subarray.
    public static void findsubArray(int[] arr){
        int n = arr.length;
        int k = 10;
        int count = 0;
        //use for loop to find start and end of the subarray
        for(int start = 0; start<n;start++){
            int pro = 1;
            for(int end = start; end<n; end++){
                pro *= arr[end];
                if(pro < k){
                    count++;
                }

            }
        }
        System.out.println("Count of subarrays whose product is less than k: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        findsubArray(arr);
        System.out.println("Subarray of this array: " + Arrays.toString(arr));
    }
}
