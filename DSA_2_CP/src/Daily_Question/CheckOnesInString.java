package Daily_Question;
//Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
//
//
//
//Example 1:
//
//Input: s = "1001"
//Output: false
//Explanation: The ones do not form a contiguous segment.
//Example 2:
//
//Input: s = "110"
//Output: true
//
//
//Constraints:
//
//1 <= s.length <= 100
//s[i]​​​​ is either '0' or '1'.
//s[0] is '1'.

public class CheckOnesInString {
    public static boolean checkOnesSegment(String s) {
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s  = "011101";
        System.out.println(checkOnesSegment(s));
    }
}
