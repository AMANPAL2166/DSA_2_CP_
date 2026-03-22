package String;

public class isSubsequence {
    public static boolean isSubSequence(String s1, String s2,
                                 int m, int n){
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return isSubSequence(s1, s2, m - 1, n - 1);

        // If last characters are not matching
        return isSubSequence(s1, s2, m, n - 1);
    }

    public static void main(String[] args) {
        String s1 = "AXY" ;
        String s2 = "YADXCP";
        int n = s1.length(), m = s2.length();
        System.out.println(isSubSequence(s1,s2,n,m));

    }
}
