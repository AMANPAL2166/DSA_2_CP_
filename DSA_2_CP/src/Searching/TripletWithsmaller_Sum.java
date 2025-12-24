package Searching;

import java.util.Arrays;
//Problem::- Given a distinct array we need to find three element whose sum is less than given sum
//solution:: - 1)Sort the  array.... 2)run a pointer

public class TripletWithsmaller_Sum {
    public static void main(String[] args) {
        long[] arr = {5, 1, 3, 4, 7};
        int n = arr.length;
        int sum =12;
        System.out.println(countTriplets(n,sum,arr));

    }
    public static long countTriplets(int n, int sum, long arr[]) {
        int ans  =0;
        Arrays.sort(arr);//{1,3,4,5,7}
        for(int i  =0; i<n-2;i++){
            int start = i+1, end = n-1;
            while(start<=end){
                if(arr[i]+arr[start]+arr[end]>=sum){
                    end--;
                }else{
                    ans+=(end-start);
                    start++;

                }

            }
        }
        return ans;


    }

}
