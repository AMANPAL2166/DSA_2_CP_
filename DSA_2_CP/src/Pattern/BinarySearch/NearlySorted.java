package Pattern.BinarySearch;

public class NearlySorted {
    public static int NearSorte(int[] arr, int target) {
        int  start  = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (mid-1>=start && arr[mid+1] == target) {
                return mid+1;
            } else if (mid+1 <= end && arr[mid+1] == target) {
                return mid-1;
            }
            if(arr[mid] > target){
                end = mid-2;
            }else{
                start = mid+2;
            }
        }
        return -1;



    }

    public static void main(String[] args) {
        int[] nums = {10 ,3 ,40 ,20, 50 ,80, 70};
        System.out.println(NearSorte(nums,90));
    }
}
