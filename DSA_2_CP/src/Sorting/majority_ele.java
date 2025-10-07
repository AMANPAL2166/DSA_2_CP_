package Sorting;

public class majority_ele {
    public static int majorityElement(int[] nums) { //This not a correct method to solve this problem , it's just for learning purpose...
        int major = 0;
        for(int i = 0; i< nums.length; i++){
            int j = 0;
            int count = 0;
            while(j < nums.length){
                if(nums[i] == nums[j]) {
                    count++;
                    j++;

                }else{
                    j++;
                }


            }

            if(count > major){
                major = count;
            }
            i++;



        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,2,3};
        System.out.println(maj(nums));
    }

    public static int  maj(int[] nums) {

        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count> nums.length/2){
                return nums[i];
            }
        }
        return -1;

    }
}
