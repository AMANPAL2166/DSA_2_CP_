package NEETCODE.SLIDING_WINDOW;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

         char[] arr = s.toCharArray();
         int ans = 0;

         for(int i = 0;i<arr.length;i++){
             int count = 1;
             for(int j= i+1;j<arr.length-1;j++){
                 if(arr[i] != arr[j] && arr[j] !=arr[j+1]){// forget track
                     count++;
                 }else{
                     break;
                 }

             }
             ans = Math.max(ans, count);
         }
         return ans;

    }
    public static int lengthOfLongestSubstring_(String s) {
        //This will solve using hashset
        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right  = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right-left+1);
        }
        return max;

    }

    public static void main(String[] args) {
        String st = "abc";
        System.out.println(lengthOfLongestSubstring_(st));
    }
}
