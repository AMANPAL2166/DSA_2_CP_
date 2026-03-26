package NEETCODE.TWO_POINTERS;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        //edge casess
        if(s==" "){
            return true;
        }
        String upper = s.toUpperCase();
        String clean = upper.replaceAll("[^a-zA-Z0-9]", "");
        char[] ans = clean.toCharArray();
        int st  = 0;
        int end = ans.length-1;
        while(st<=end){
            if(ans[st]!= ans[end]){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(st));
    }
}
