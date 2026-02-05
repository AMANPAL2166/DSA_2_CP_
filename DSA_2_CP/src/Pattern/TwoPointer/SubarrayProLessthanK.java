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

    }

    public static void main(String[] args) {
        int[] arr= {10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr,100));
    }
}
