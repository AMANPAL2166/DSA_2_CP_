package Array;

import java.util.Arrays;

public class Prod_Of_Array_except_self {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] finalProduct = new int[nums.length];
        //This is for prefix product
        for(int i = 0; i< nums.length ; i++){
            int prod = 1;
            for(int j = i+1; j< nums.length ; j++){
                prod = prod*nums[j];

            }
             prefix[i] = prod;
        }
        for(int i = nums.length-1; i>= 0 ; i--){
            int prod = 1;
            for(int j = i-1; j>= 0 ; j--){
                prod = prod*nums[j];

            }
            postfix[i] = prod;
        }
        //for final product of an array
        for(int i = 0 ; i< nums.length; i++){
            finalProduct[i] = prefix[i] * postfix[i];
        }
        return finalProduct;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf_Opt(arr)) );

    }
    public static int[] productExceptSelf_Opt(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // 1) prefix products into res
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;      // product of elements to the LEFT of i
            prefix *= nums[i];
        }

        // 2) multiply by suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;     // multiply by product of elements to the RIGHT of i
            suffix *= nums[i];
        }

        return res;
    }

}
