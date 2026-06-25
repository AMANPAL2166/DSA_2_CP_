package Daily_Doze;

public class June22 {
    //Let's revise all the sorting algo
    //start with ...
    //ex [5, 2, 4, 1, 3]
    static int[] bubble(int[] arr){
        //Bada element bubble ki tarah upar (end) chala jata hai.
        int n = arr.length;

        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] <arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    static int[] Insertion(int[] arr){
        int n= arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
        return arr;
    }
    class Solution {
        public int[] sortArray(int[] nums) {
            mergeSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void mergeSort(int[] nums, int left, int right) {
            if (left >= right) {
                return; // Base case: single element or invalid bounds
            }

            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            // Merge the sorted halves
            merge(nums, left, mid, right);
        }

        private void merge(int[] nums, int left, int mid, int right) {
            // Sizes of the two subarrays to be merged
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Create temporary arrays
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copy data to temporary arrays
            for (int i = 0; i < n1; i++) leftArray[i] = nums[left + i];
            for (int j = 0; j < n2; j++) rightArray[j] = nums[mid + 1 + j];

            // Merge the temporary arrays back into nums[left...right]
            int i = 0, j = 0;
            int k = left; // Initial index of merged subarray

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    nums[k] = leftArray[i];
                    i++;
                } else {
                    nums[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of leftArray[], if any
            while (i < n1) {
                nums[k] = leftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements of rightArray[], if any
            while (j < n2) {
                nums[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {5, 4, 3,2,1};
        int[] ans = Insertion(arr);
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
    
}
