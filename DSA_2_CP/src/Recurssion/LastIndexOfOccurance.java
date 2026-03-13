package Recurssion;

public class LastIndexOfOccurance {
    public static int lastOcc(int[] arr, int idx, int tar) {
        //base case
        if(idx == arr.length){
            return -1;
        }
        int last = lastOcc(arr,idx+1, tar);
        if(last == -1){
           if(arr[idx] == tar){
               return idx;
           }else{
               return -1;
            }

        }else{
            return last;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,3,3,2,5,4};
        System.out.println(lastOcc(arr,0,5));
    }

}
