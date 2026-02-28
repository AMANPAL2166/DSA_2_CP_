package Sorting;

public class OptBubbleSort {
    public static void BubbleSort(int[] arr , int n){
        int i, j,temp;
        boolean swapped;
        for( i = 0;i<arr.length-1;i++){
            swapped = false;
            for(j = 0; j<n-i-1;j++ ){
                if(arr[j]>arr[j+1]){
                    //swap
                    temp= arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            //if no two element were swapped by inner loop, then break;
            if(swapped = false){
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int n= arr.length;
        BubbleSort(arr, n);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
