package Pattern.TwoPointer;

public class RemoveOccurance {
    public static int removeElement(int[] nums, int val) {

        int ansIdx = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == val){
                continue;
            }else{
                nums[ansIdx] = nums[i];
                ansIdx++;
            }
        }
        return ansIdx ;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(arr,val));
    }
}
