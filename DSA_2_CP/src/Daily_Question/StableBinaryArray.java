package Daily_Question;
//You are given 3 positive integers zero, one, and limit.
//
//A binary array arr is called stable if:
//
//The number of occurrences of 0 in arr is exactly zero.
//The number of occurrences of 1 in arr is exactly one.
//Each subarray of arr with a size greater than limit must contain both 0 and 1.
//Return the total number of stable binary arrays.
//
//Since the answer may be very large, return it modulo 109 + 7.
//
//
//
//Example 1:
//
//Input: zero = 1, one = 1, limit = 2
//
//Output: 2
//
//Explanation:
//
//The two possible stable binary arrays are [1,0] and [0,1].
//
//Example 2:
//
//Input: zero = 1, one = 2, limit = 1
//
//Output: 1
//
//Explanation:
//
//The only possible stable binary array is [1,0,1].
//
//Example 3:
//
//Input: zero = 3, one = 3, limit = 2
//
//Output: 14
//
//Explanation:
//
//All the possible stable binary arrays are [0,0,1,0,1,1], [0,0,1,1,0,1], [0,1,0,0,1,1], [0,1,0,1,0,1], [0,1,0,1,1,0], [0,1,1,0,0,1], [0,1,1,0,1,0], [1,0,0,1,0,1], [1,0,0,1,1,0], [1,0,1,0,0,1], [1,0,1,0,1,0], [1,0,1,1,0,0], [1,1,0,0,1,0], and [1,1,0,1,0,0].
//
//
//
//Constraints:
//
//1 <= zero, one, limit <= 1000
/// Quick Recap & ObservationTime Complexity: $O(\text{zero} \times \text{one})$,
/// jo $1000 \times 1000$ ke constraints ke liye ideal hai.Accuracy Check: Yaad hai confusion matrix waala question?
/// Wahan humne accuracy $0.75$ calculate ki thi ($40+35/100$).
/// Yahan DP state ki accuracy maintain karne ke liye humein ye "subtraction" logic lagana pada taaki "invalid" arrays count na ho jayein.

public class StableBinaryArray {
    public static int  numberOfStableArray(int zero, int one, int limit){
        int MOD = 1_000_000_007;
        long[][][] dp = new long[zero + 1][one + 1][2];

        // Base cases: only zeros or only ones within limit
        for (int i = 1; i <= Math.min(zero, limit); i++) dp[i][0][0] = 1;
        for (int j = 1; j <= Math.min(one, limit); j++) dp[0][j][1] = 1;

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                // Ending with 0
                dp[i][j][0] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % MOD;
                if (i > limit) {
                    // Subtract sequences that would have limit + 1 zeros
                    dp[i][j][0] = (dp[i][j][0] - dp[i - limit - 1][j][1] + MOD) % MOD;
                }

                // Ending with 1
                dp[i][j][1] = (dp[i][j - 1][0] + dp[i][j - 1][1]) % MOD;
                if (j > limit) {
                    // Subtract sequences that would have limit + 1 ones
                    dp[i][j][1] = (dp[i][j][1] - dp[i][j - limit - 1][0] + MOD) % MOD;
                }
            }
        }

        return (int) ((dp[zero][one][0] + dp[zero][one][1]) % MOD);
    }

}
