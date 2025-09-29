package Recurssion;

public class Display_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30, 40};
        int idx = 3;
        max(arr, idx);
        int x = 30;
        System.out.println(firstIndex(arr,idx, x));


    }

    public static void display(int[]arr,int idx) {
        int n = arr.length;
        if(idx == n ){
            return;
        }
        System.out.println(arr[idx]);
        display(arr,idx+1);


    }

    public static void displayreverse(int[] arr, int idx) {
        //base case
        if(idx == arr.length){
            return;
        }

        displayreverse(arr, idx+1);
        System.out.println(arr[idx]);

    }

    public static int max(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = max(arr, idx+1);
        if(misa > arr[idx]){
            return misa;

        }else{
            return arr[idx];
        }

    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx == arr.length-1){
            return -1;
        }
        int fiisa = firstIndex(arr, idx+1, x);
        if(arr[idx]==x){
            return idx;
        }else{
            return fiisa;
        }
    }

}

