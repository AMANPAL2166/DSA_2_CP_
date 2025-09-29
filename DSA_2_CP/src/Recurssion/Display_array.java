package Recurssion;

public class Display_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30, 40};
        int idx = 2;
        displayreverse(arr, idx);

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
}
