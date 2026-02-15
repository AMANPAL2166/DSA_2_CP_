package Pattern.TwoPointer;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int i = 2;
        for(int j = 2; j<n;j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
