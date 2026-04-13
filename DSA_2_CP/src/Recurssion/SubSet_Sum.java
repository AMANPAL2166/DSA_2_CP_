package Recurssion;

public class SubSet_Sum {
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return subSet(arr, arr.length, sum);
    }
    static Boolean subSet(int arr[],int n, int sum) {
        //base case
        if(sum ==0) return true;
        if(n== 0) return false;
        //If last elemnet is greater than sum, ignore it
        if(arr[n-1]>sum){
            return subSet(arr, n-1, sum);
        }
        //Check if sum can be obtained by including
        //or excluding the last element
        return subSet(arr,n-1,sum) || subSet(arr,n-1,sum-arr[n-1]);
    }
}
