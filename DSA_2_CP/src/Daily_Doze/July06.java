package Daily_Doze;

import java.util.HashMap;
import java.util.Stack;

public class July06
{
    public static boolean isValid(String s) {
        //edge case
        if(s.length()==1) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                //check stack is empty or not
                if(st.empty()){
                    return false;
                }
                //check st top
                else if (st.peek() == '(') {
                    st.pop();

                }else{
                    return false;
                }
            }
            if(s.charAt(i) == '}'){
                //check stack is empty or not
                if(st.empty()){
                    return false;
                }
                //check st top
                else if (st.peek() == '{') {
                    st.pop();

                }else{
                    return false;
                }
            }
            if(s.charAt(i) == ']'){
                //check stack is empty or not
                if(st.empty()){
                    return false;
                }
                //check st top
                else if (st.peek() == '[') {
                    st.pop();

                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            for (int j = 0;j<nums2.length;j++ ){
                if(nums1[i] == nums2[j]){
                    //condition
                    while(j+1<nums2.length){
                        if(nums2[j] > nums1[i]){
                            ans[i] = nums2[j];
                            break;
                        }else {
                            ans[i] = -1;
                        }
                        j++;
                    }
                }
            }
        }
        return ans;

    }
    //this is more clean code of nextgreatest ele 1
    public static int[] nextGreaterElement_(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        //Outer Loop: iterate to the length of nums1.length
        for(int i = 0;i<nums1.length;i++){
            ans[i] = -1;
             //initiaze j to find nums1[i] in nums2
            int j= 0;
            //condition
            while (j<nums2.length && nums1[i] != nums2[j]) j++;
            //now find the greatest ele in nums2
            for(int k = j+1;k<nums2.length;k++){
                if(nums1[i] < nums2[k]){
                    ans[i] = nums2[k];
                    break;//break
                }
            }
        }
        return ans;

    }
    public static int[] nextGreaterElement__(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 to find the next greater element for every number
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Build the result array for nums1 using the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return ans;
    }



    public static void main(String[] args) {
//        String s= "((";
//        System.out.println(isValid(s));
        int[] nums1 = {2,4}, nums2 = {1, 2,3,4};
        int[] ans = nextGreaterElement__(nums1,nums2);
        for(int ele: ans){
            System.out.print(ele + " ");
        }
    }
}
