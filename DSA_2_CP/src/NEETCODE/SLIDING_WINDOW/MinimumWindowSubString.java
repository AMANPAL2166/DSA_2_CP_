package NEETCODE.SLIDING_WINDOW;

import java.util.HashSet;

public class MinimumWindowSubString {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] freq = new int[128];

        // store t frequency
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int left = 0, right = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()){

            // include right char
            if(freq[s.charAt(right)] > 0){
                count--;
            }
            freq[s.charAt(right)]--;
            right++;

            // valid window
            while(count == 0){

                // update answer
                if(right - left < minLen){
                    minLen = right - left;
                    start = left;
                }

                // remove left char
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] > 0){
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static String minWindow_Brute(String s, String t){
        String ans = "";
        int n= s.length();
        //iterate
        for(int i = 0;i<n;i++){
            //iterate j
            for(int j = i;j<n;j++){
                String sub = s.substring(i, j+1);
                if(isValid(sub,t)){
                    if(ans.equals("")|| sub.length()<ans.length()){
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isValid(String sub, String t){
        //use ASCIID FREQ index
        int[] freq = new int[128];
        for(char c: sub.toCharArray()){
            freq[c]++;

        }
        for(char c: t.toCharArray()){
            if(freq[c]==0){
                return false;
            }
            freq[c]--;
        }
        return true;

    }
}
