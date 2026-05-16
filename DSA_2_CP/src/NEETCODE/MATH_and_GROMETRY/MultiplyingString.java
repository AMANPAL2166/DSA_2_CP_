package NEETCODE.MATH_and_GROMETRY;

import java.util.Arrays;

public class MultiplyingString {
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length(), n2 = num2.length();
        int[] res = new int[n1+n2];
        //Start multiplying from end
        for(int i = n1-1;i>=0;i--) {
            for(int j = n2-1;j>=0;j--){
                int mul = (num1.charAt(i) - '0')* (num2.charAt(j) - '0');
                int sum = mul+res[i+j+1];//Add carry from last
                res[i+j+1] = sum%10;//Current digit
                res[i+j] += sum/10;//Agla carry

            }
        }
        StringBuilder sb = new StringBuilder();
        for(int p: res){
            //Leading zeros ko skip karne ke liye check
            if(!(sb.length()==0 && p == 0)){
                sb.append(p);
            }
        }
        return sb.length()== 0? "0": sb.toString();
    }

    public static void main(String[] args) {
        String a = "123";
        String b = "2";
        String ans = multiply(a, b);
        System.out.println(Arrays.toString(ans.toCharArray()));
    }
}
