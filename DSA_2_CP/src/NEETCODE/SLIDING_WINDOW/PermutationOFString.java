package NEETCODE.SLIDING_WINDOW;

import java.util.Arrays;

public class PermutationOFString {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        for(int i = 0;i<s2.length()-k;i++){
            String sub = s2.substring(i, i+k);
            char[] a = s1.toCharArray();
            char[] b = sub.toCharArray();
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

    }
}
