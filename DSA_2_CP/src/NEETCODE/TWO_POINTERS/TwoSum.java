package NEETCODE.TWO_POINTERS;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n= numbers.length;
        int st= 0, end = n-1;
        while(st<=end){
            int sum = numbers[st]+numbers[end];
            if(sum==target){
                ans[0] = st+1;
                ans[1] = end+1;
                break;
            }
            if(sum>target){
                end--;
            }else{
                st++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr, 9);
        for(int i=0;i<ans.length;i++){
            System.out.print (ans[i] + " ");
        }

    }
}
