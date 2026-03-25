package NEETCODE.Arrays_and_hashing;

public class ExecpSelf {
    public static int[] productExceptSelf(int[] nums) {
        /// TLC on Constraints:
        ///
        /// 2 <= nums.length <= 105
        /// -30 <= nums[i] <= 30
        /// The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans= new int[n];
        //prefix
        for(int i= 0;i<n;i++){
            int pro = 1;
            for(int j = i+1;j<n;j++){
                pro *= nums[j];
            }
            prefix[i] = pro;
        }
        //suffix
        for(int i= n-1;i>=0;i--){
            int pro = 1;
            for(int j = i-1;j>=0;j--){
                pro *= nums[j];
            }
            suffix[i] = pro;
        }
        for(int i = 0;i<n;i++){
            ans[i] = suffix[i]*prefix[i];
        }


        return ans;

    }
    public static int[] productExceptSelf_2(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        int[] res = new int[n];
        //prefix
        pre[0] = 1;
        for(int i = 1; i<n; i++){
            pre[i] = pre[i-1]*nums[i-1];

        }
        // suffix
        suff[n-1] =1;
        for(int i = n-2; i>=0;i-- ){
            suff[i] = suff[i+1]*nums[i+1];
        }
        //multiply
        for(int i =0; i<n; i++){
            res[i] = pre[i]*suff[i];

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3};
        int[] ans= productExceptSelf_2(arr);
        for(int a  = 0;a<ans.length;a++){
            System.out.print(ans[a] + " ");
        }

    }
}
