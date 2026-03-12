package Recurssion;

public class MaxOfArray {
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int max = maxOfArray(arr, idx+1);
         if(max>arr[idx]){
             return max;
         }else{
             return arr[idx];
         }



    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,511,3};
        System.out.println(maxOfArray(arr, 0));
    }
}
