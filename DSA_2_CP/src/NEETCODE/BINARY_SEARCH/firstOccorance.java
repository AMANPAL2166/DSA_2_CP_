package NEETCODE.BINARY_SEARCH;

public class firstOccorance {
    public static int first(int[] arr,int target) {
        int low = 0;
        int high = arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target ){
                first = mid;
                high = mid-1;
            }else if(   arr[mid]> target) {
                high= mid-1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }

    public static int firrst(int[] arr, int target, int low, int high) {
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(arr[mid] == target)  {
            // Try to find an even earlier occurrence in the left half
            int result = firrst(arr, target, low, mid - 1);

            // If the left side didn't find anything, this 'mid' is the first!
            return (result == -1) ? mid : result;
        }
        else if (arr[mid]>target) {
            return firrst(arr, target, low, mid-1);
        }else{
            return firrst(arr, target, mid+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,4,5};
        System.out.println(first(arr,2));
        System.out.println(firrst(arr, 2, 0,arr.length-1));
    }
}
