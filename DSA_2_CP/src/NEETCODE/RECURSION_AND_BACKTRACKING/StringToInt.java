package NEETCODE.RECURSION_AND_BACKTRACKING;

public class StringToInt {
    //globle int max and min
    static  int maxInt = Integer.MAX_VALUE;
    static int minInt = Integer.MIN_VALUE;
    //string to int function
    private static int myAtoi(String s){
        int i = 0;
        int n = s.length();
        //remove while spaces
        while(i<n && s.charAt(i) == ' ') i++;
        //handle sign if += 1 or if  -= -1 if neither present treate as +1
        int sign = 1;
        if(  i < n && (s.charAt(i) == '+' || s.charAt(i) == '-') ){
            sign = (s.charAt(i) == '-') ? -1:1;
            i++;
        }

        //read the int by skipping 0's and stop when find char
        //handle over and under flow
        //call recursive helper function
        return helper(s, i, 0, sign);

    }
    private static int helper(String s, int i , long num , int sign){
        //base case
        if(i>= s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(num*sign);
        }
        //update num
        num = num*10 + (s.charAt(i)-'0');
        //hadle over and under flow
        if(sign *num  <= Integer.MIN_VALUE)return Integer.MIN_VALUE;
        if(sign*num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        //Hypothesis
        return helper(s, i+1, num, sign);
    }

    public static void main(String[] args) {
            String s = "   -12345";
            System.out.println(myAtoi(s)); // Output: -12345
    }

}
