package Daily_Question;

public class MinimizeArrraysum {
    public static long minArraySum(int[] nums) {
        int i = 0;
        int j= 1;
        while(i<nums.length){
            if(nums[i] > nums[j] && nums[i]%nums[j] ==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        long sum = 0;
        for(int k= 0;k<nums.length;k++){
            sum+= nums[k];
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] a  = {3, 6, 2};
        System.out.println(minArraySum(a));
        System.out.println(minArraySum(a));

    }

}
