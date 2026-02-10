package Pattern.SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
         //Get length of s1
        int k = s1.length();
        for(int i = 0;i<=s2.length()-k; i++){
            //create new string to check that specific window to the length of k
            String sub = s2.substring(i, i+k);
            //create two char variable
            char[] a = s1.toCharArray();
            char[] b= sub.toCharArray();
            //Now sort
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));


    }
}
