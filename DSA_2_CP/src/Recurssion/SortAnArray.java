package Recurssion;

import java.util.Arrays;

public class SortAnArray {
    public static void mergeSort(int[] nums) {
         int n = nums.length;
        //base case
        if(n==1) return;

        //Step 1: Create 2 empty array
        int[] a = new int[n/2];
        int[] b= new int[n-n/2];

        //Step 2: Copy paste arr into a and b
        int idx = 0;
        for(int i =0;i<a.length;i++ ){
            a[i] = nums[idx++];
        }
        for(int  j= 0;j<b.length;j++ ){
            b[j] = nums[idx++];
        }

        //Step 3: Magic
        mergeSort(a);
        mergeSort(b);
        add(a,b,nums);

    }
    public static void add(int[] a, int[] b, int[] add) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]) {
                add[k++] = a[i++];
            } else {
                add[k++] = b[j++];
            }
        }
        while(i<a.length ) add[k++] = a[i++];
        while(j<b.length) add[k++] = b[j++];
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3, 7};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(nums));

        mergeSort(nums);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(nums));

    }

}
