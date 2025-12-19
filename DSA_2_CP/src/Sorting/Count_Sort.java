package Sorting;
//--->All about count sor<------

import java.util.Arrays;

/// Good For: Sorting small integers, as a subroutine in Radix Sort.
/// Bad For: Large ranges (\(k\)), as it uses \(O(k)\) extra space.

public class Count_Sort {
    public static int[] countSort(int[] arr) {
        //base case
        int n = arr.length;
        if(n==0){
            return new int[0];
        }
        //find the maximum element of the array
        int maxelement = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > arr[maxelement]){
                maxelement = arr[i];
            }
        }

        //create and initialize cntArr array
        int[] cntArray = new int[maxelement+1];
        for(int i = 0; i<= maxelement; i++){
            cntArray[i] = 0;
        }
        //count frequency of each element
        for(int i = 0; i<n; i++){
            cntArray[arr[i]]++;
        }
        //compute prefix sum
        for(int i = 1; i<=maxelement; i++){
            cntArray[i] +=cntArray[i-1];
        }
        //build output array
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--){
            int v = arr[i];
            ans[cntArray[v]-1] = v;
            cntArray[v]--;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
        int[] ans = countSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
