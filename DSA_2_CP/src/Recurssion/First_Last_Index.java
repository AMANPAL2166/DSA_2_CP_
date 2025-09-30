package Recurssion;

import java.util.Scanner;

public class First_Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int fi = last(arr, 0, d);
        System.out.println(fi);

    }

    public static int  first(int[] arr, int idx,int x) {
        //base case
        if(idx == arr.length ){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            int fiss = first(arr, idx+1,x);
            return fiss;
        }

    }

    public static int last(int[] arr, int idx, int x ) {
        if (idx == arr.length) {
            return -1;
        }
        int liisa = last(arr, idx + 1, x);
        if (liisa == -1) {
            if (arr[idx] == -1) {
                if (arr[idx] == x) {
                    return idx;
                } else {
                    return -1;
                }
            }

        }

        return liisa;
    }
}
