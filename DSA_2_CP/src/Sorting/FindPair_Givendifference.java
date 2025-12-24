package Sorting;

import java.util.Arrays;

public class FindPair_Givendifference {
    public static void main(String[] args) {
        int[] arr = {1, 10, 1 ,1 ,7 ,2};
        int x = 8;
        System.out.println(findPair(arr, x));
    }
    public static boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);//{1,1,1,2,7,10}
        //Now I'm gonna use two pointer
        int i = 0, j=arr.length-1;
        while(i<=j){

            int ans = arr[j] + arr[i];
            if(ans == x){
                return true;
            }
            if(ans>x){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
