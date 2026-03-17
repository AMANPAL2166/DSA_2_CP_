package A_TO_Z_Sheet.Strings_Basic_Medium;

public class LargestOddNum {
    public static String largestOddNumber(String num) {
        //edge cases
        if(num.charAt(num.length()-1) %2 != 0){
            return num;
        }
        int i = num.length()-1;
        while(i>=0){
            int n = num.charAt(i);
            if(n%2==1 ) return num.substring(0,i+1);
            i--;
        }
        return "";

    }

    public static void main(String[] args) {
        String s = "35427";
        System.out.println(largestOddNumber(s));
    }
}
