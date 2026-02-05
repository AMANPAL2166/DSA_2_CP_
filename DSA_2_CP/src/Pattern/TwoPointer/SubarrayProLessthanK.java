package Pattern.TwoPointer;

public class SubarrayProLessthanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        //Brute force
        int count = 1;

        for(int i = 0; i<nums.length;i++){
            int pro = 1;
            for(int j = i; j<nums.length;j++){
                pro *= nums[j];
                if(pro <k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }//Two pointer
    public static int numSubarray(int[] nums, int k){
        //Base case
        if(k<1){
            return 0;
        }
        int count = 0;
        int left = 0;
        int pro = 1;
        for(int start = 0; start<nums.length;start++){
            pro *= nums[start];
            while(pro>=k){
                pro/=nums[left];
                left++;
            }
            count += (start - left+1);
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr= {10,5,2,6};
        System.out.println(numSubarray(arr,100));
    }
}
