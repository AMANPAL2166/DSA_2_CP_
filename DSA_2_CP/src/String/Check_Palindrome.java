package String;

//https://leetcode.com/problems/valid-palindrome/submissions/1774106600/

//https://www.geeksforgeeks.org/dsa/palindrome-string/
public class Check_Palindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(palindrome2(s));
    }

     static boolean palindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;

        //check while left != right
        while(left<right){
            //If the character at the current position
            //are not equal
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right--;
        }
        return true;
    }
    static boolean palindrome2(String s ) {
        //Base case
        if (s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            // If both characters are alphanumeric, compare them
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
