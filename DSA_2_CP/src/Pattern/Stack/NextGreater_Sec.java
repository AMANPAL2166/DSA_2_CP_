package Pattern.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater_Sec {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < 2*n; i++){

            int num = nums[i % n];

            while(!st.isEmpty() && nums[st.peek()] < num){
                ans[st.pop()] = num;
            }

            if(i < n){
                st.push(i);
            }
        }

        return ans;

    }

    public static int[] nextGreater_2(int[] arr) {
        int[] ans = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            ans[i]=-1;
            for(int j  = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            ans[i]=-1;
            for(int j  = i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = nextGreaterElements(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print( ans[i]);
            System.out.print (" ");
        }

    }
}
