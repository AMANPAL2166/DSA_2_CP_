package Pattern.Prefix;

public class LongestSubarrayofOne {
//    public static int longestSubarray(int[] nums) {
//        int count = 1;
//        for(int i = 0;i<nums.length;i++){
//
//            if(nums[i] != 1){
//                continue;
//            }
//            int locount = 1;
//            int zero  = 0;
//            for(int j  = i+1;j<nums.length;j++){
//
//                if(nums[j] != 1   && zero<2){
//                    zero++;
//                    continue;
//
//                }else{
//                    i=j;
//                    break;
//                }
//
//            }
//            count = Math.max(count, locount);
//        }
//        if(count == nums.length){
//            return count-1;
//        }
//        return count;
//
//    }
    public static int longestSubarray(int[] nums) {
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++) {

            int zeroCount = 0;
            int length = 0;

            for(int j = i; j < nums.length; j++) {

                if(nums[j] == 0) {
                    zeroCount++;
                }

                if(zeroCount > 1) {
                    break;
                }

                length++;
            }

            maxLen = Math.max(maxLen, length);
        }

        // must delete one element
        if(maxLen == nums.length) {
            return nums.length - 1;
        }

        return maxLen - 1;
    }
    //Optimized method using sliding window
    public static int maxSubarray(int[] nums){
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left);
        }
        return maxLength ;
    }

        public static void main (String[]args){
            int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
            System.out.println(maxSubarray(nums));
        }

    }