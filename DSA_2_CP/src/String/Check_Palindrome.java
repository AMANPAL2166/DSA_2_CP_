package String;
//https://www.geeksforgeeks.org/dsa/palindrome-string/
public class Check_Palindrome {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(palindrome(s));
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
}
