package Searching;

public class peak_index {
    public static void main(String[] args) {
        int[] arr = {0,10, 2};
        peak_index obj = new peak_index();
        System.out.println(obj.peakIndex_2(arr));

    }
    public int peakIndexInMountain_1(int[] arr){
         int n = arr.length;
         for(int i = 1; i<n; i++){
             while(arr[i] <arr[i-1]){
                 return i-1;
             }
         }
         return -1;
    }
    public int peakIndex_2(int[] arr){

            int low = 0, high = arr.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    // Peak lies on the right side
                    low = mid + 1;
                } else {
                    // Peak lies on the left side or at mid
                    high = mid;
                }
            }
            return low; // low == high is the peak index

    }
}
