package String;

public class EqualBracket {
    public static long  countSub(String str) {
        // Your code goes here
        int n = str.length();
        int[] prefixOpen = new int[n + 1];
        int[] suffixClose = new int[n + 1];

        // Build prefix of '('
        for (int i = 0; i < n; i++) {
            prefixOpen[i + 1] = prefixOpen[i] + (str.charAt(i) == '(' ? 1 : 0);
        }

        // Build suffix of ')'
        for (int i = n - 1; i >= 0; i--) {
            suffixClose[i] = suffixClose[i + 1] + (str.charAt(i) == ')' ? 1 : 0);
        }

        for (int i = 0; i <= n; i++) {
            if (prefixOpen[i] == suffixClose[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "))";
        System.out.println(countSub(str));
    }
}
