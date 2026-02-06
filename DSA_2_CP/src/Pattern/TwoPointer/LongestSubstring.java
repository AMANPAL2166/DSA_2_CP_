package Pattern.TwoPointer;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int glomax = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // If character exists, shrink window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add current character and update max
            set.add(s.charAt(right));
            glomax = Math.max(glomax, right - left + 1);
        }
        return glomax;

    }

    public static void main(String[] args) {
        String  s= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        lengthOfLongestSubstring(s);
    }
}
