package NEETCODE.STACK;

import java.util.Stack;

public class Daily_Temperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans= new int[n];
        for(int i= 0;i<n;i++){
            int dayCount = 1;
            for(int j= i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    ans[i] = dayCount;
                    break;
                }else{
                    dayCount++;
                }
            }
        }
        return ans;

    }
    public static int[] dailyTemperatures_(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
           while(!st.isEmpty() && temperatures[st.peek()]< temperatures[i]){
               ans[st.peek()] = i-st.pop();
           }
           st.push(i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] tem = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans =  dailyTemperatures_(tem);
        for(int i : ans){
            System.out.println(ans[i] + " ");
        }
    }
}
