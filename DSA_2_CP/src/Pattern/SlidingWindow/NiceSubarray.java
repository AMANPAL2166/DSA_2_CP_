package Pattern.SlidingWindow;

public class NiceSubarray {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            int odd = 0;
            for(int j = i; j<n; j++){
                if(nums[j] % 2 != 0){
                    odd++;
                }
                if(odd == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static int numberOfSubarray(int[] nums, int k){
        return atMostK(nums, k) - atMostK(nums, k-1);
    }

    private static int atMostK(int[] nums, int k) {
        int left = 0;
        int countOdd = 0;
        int ans=0;
        for(int right = 0; right<nums.length; right++){
            //If current is odd, increase odd count
            if(nums[right]%2 != 0) {
                countOdd++;
            }
            //If oddCount exceeds k, shrink window from left
            while(countOdd>k){
                if(nums[left] %2 != 0){
                    countOdd--;
                }
                left++;
            } //All subarrays ending at 'right' are valid
            ans += (right-left+1);
        }
       return ans;

    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarray(arr, k));
    }
}
