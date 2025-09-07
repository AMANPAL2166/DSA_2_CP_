package Array;

public class suffix_preffix {
    public static void main(String[] args) {
        int[] num = {3,5,2,6,3,6};
        int[] anssuffix = suff(num);
        int[] anspreffix = pre(num);
        for(int i : anssuffix){
            System.out.print (i +" ");
        }
        System.out.println(" ");
        for(int i : anspreffix){
            System.out.print(i+" ");
        }

    }

    public static int[] suff(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] =nums[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] =  suffix[i+1]+nums[i];
        }
        return suffix ;

    }
    public static int[] pre(int[] nums){
        int n = nums.length;
        int[] ressuff = new int[n];
        ressuff[0] = 1;
        for(int i = 1; i<n-1; i++){
            ressuff[i] = ressuff[i-1]*nums[i-1];
        }
        return ressuff;
    }
}
