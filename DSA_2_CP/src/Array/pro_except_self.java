package Array;

public class pro_except_self {
    public static void main(String[] args) {
        int[] nums = {3,5,2,6,3,2};
        int[] ans = pro2(nums);

        // print result
        for(int x : ans){
            System.out.print(x + " ");
        }
    }

    public static int[] pro1(int[] nums){
        int n = nums.length;
        int[] resArr = new int[n];

        for(int i = 0; i<n; i++){
            int res = 1;
            for(int j = 0; j<n; j++){
                if(j == i) continue;   // skip nums[i]
                res *= nums[j];
            }
            resArr[i] = res;
        }
        return resArr;
    }
    public static int[] pro2(int[] nums){
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
}
