package Daily_Question;

public class contes {
    public static int[] concatWithReverse(int[] nums) {
        int n= nums.length;
        int[]  ans= new int[2*n];
        int pos = 0;
        for(int i = 0;i<n;i++){
            ans[pos] = nums[i];
            pos++;
        }
        for(int i = n-1;i>=0;i--){
            ans[pos] = nums[i];
            pos++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans=  concatWithReverse(arr);
        for(int a: ans){
            System.out.print(a);
        }
    }

}
