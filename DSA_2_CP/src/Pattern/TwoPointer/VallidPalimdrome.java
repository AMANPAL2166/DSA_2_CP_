package Pattern.TwoPointer;

public class VallidPalimdrome {
    public static boolean isPalindrome(String s) {
        String Upper = s.toUpperCase();
        String clean = Upper.replaceAll("[^a-zA-Z0-9]", "");
        char[] str = clean.toCharArray();
        int start = 0;
        int end = str.length-1;
        while(start<end) {
            if(str[start] != str[end]){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        String str =  "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
