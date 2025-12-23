package Sorting;

import java.util.Arrays;

public class ceilingInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1 ,4 ,4, 4, 4, 10};
        //Question says:: find first greater element of x;;;;;____
        int x= 4;
        System.out.println(solution2(arr,x));

    }

    public static int solution1(int[] arr, int x) {
        //this is linear search approach
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return -1;


    }
    public static int solution2(int[] arr, int x) {
        //this is binary search approach;;;;;
        int start = 0;
        int end = arr.length-1;
        int ans = -1;//extra variable for return  answer
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] < x){//if x greater, than  then ignore left half

                start = mid+1;

            }else{//if x lesser, then ignore right part
                ans = mid;
                end = mid -1;

            }
        }
        return ans;
    }

}
