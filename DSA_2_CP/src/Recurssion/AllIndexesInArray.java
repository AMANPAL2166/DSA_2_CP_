package Recurssion;

public class AllIndexesInArray {
    public static int[] allIndex(int[] arr, int tar, int idx, int fsf) {
        //base case
        if(idx ==arr.length){
            return new int[fsf] ;
        }
        if(arr[idx] == tar){
            int[] iarr = allIndex(arr,tar,idx+1,fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int[] iarr = allIndex(arr, tar,idx+1, fsf );
            return iarr;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,32,2,2,2,6};
        int[] ans = allIndex(arr,2,0,0);
        System.out.print ("[");
        for(int i = 0;i<ans.length;i++ ){
            System.out.print (ans[i]+ " ");
        }
        System.out.print ("]");
    }
}
