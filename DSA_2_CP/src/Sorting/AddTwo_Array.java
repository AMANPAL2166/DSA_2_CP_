package Sorting;

import java.util.Arrays;

public class AddTwo_Array {
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
        int[] a= {1,2,3};
        int[] b = {11,21,99};
        int[] add = new int[a.length + b.length];
        add(a,b,add);
        System.out.println(Arrays.toString(add));
    }

}
