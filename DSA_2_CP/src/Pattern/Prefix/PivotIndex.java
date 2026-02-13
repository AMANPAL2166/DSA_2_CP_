package Pattern.Prefix;

public class PivotIndex {
    public  static int pivotIndex(int[] nums) {
        int i = 1;
        int j = nums.length-1;
        int leftSum = nums[0], rightSum = nums[j];
        
        while(i<=j-1){

            if(leftSum==rightSum){
                return i;
            } else if (leftSum<rightSum) {
                leftSum += nums[i];
                i++;
            }else{
                rightSum += nums[j-1];
                j--;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
