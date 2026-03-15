package Daily_Question;

/// A happy string is a string that:
///
/// consists only of letters of the set ['a', 'b', 'c'].
/// s[i] != s[i+1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
/// For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.
///
/// Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.
///
/// Return the kth string of this list or return an empty string if there are less than k happy strings of length n.
///
///
///
/// Example 1:
///
/// Input: n = 1, k = 3
/// Output: "c"
/// Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
/// Example 2:
///
/// Input: n = 1, k = 4
/// Output: ""
/// Explanation: There are only 3 happy strings of length 1.
/// Example 3:
///
/// Input: n = 3, k = 9
/// Output: "cab"
/// Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"
///
///
/// Constraints:
///
/// 1 <= n <= 10
/// 1 <= k <= 100
///
// Bhai ek pro-tip:Total happy strings kitni ban sakti hain?Pehle place ke liye 3 choices.
// Baaki har place ke liye 2 choices (pichle waale ko chhod kar).Total = $3 \times 2^{(n-1)}$.

public class HappyString {
    static int count = 0;
    static String  result = "";
    public static String getHappyString(int n, int k) {
        backtracking(n,k,new StringBuilder());
        return result;

    }
    private static void backtracking(int n, int k, StringBuilder current) {
        // Agar result mil gaya hai toh aage check karne ki zaroorat nahi
        if (!result.equals("")) return;

        // Base case: String ki length n ho gayi
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current.toString();
            }
            return;
        }

        // 'a', 'b', 'c' ke liye try karo
        for (char ch = 'a'; ch <= 'c'; ch++) {
            // Check karo ki pichla character same toh nahi hai
            if (current.length() > 0 && current.charAt(current.length() - 1) == ch) {
                continue;
            }

            // Character add karo
            current.append(ch);

            // Agla character dhundne ke liye recursion call
            backtracking(n, k, current);

            // Backtrack: Pichla character hatao taaki doosri choice try kar sakein
            current.deleteCharAt(current.length() - 1);
        }
    }

}
