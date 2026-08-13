package NEETCODE.GREEDY;

public class validParentheisis {
    public static boolean isValid(String str) {
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(') count++;
            if(str.charAt(i) == ')') count--;
            if(count<0) return false;
        }
        return true;
    }
    public static boolean isValidSpecialCase(String str) {
         return help(str,0, 0);
    }

    private static boolean help(String str, int ind, int count) {
        //if count is less than 0 return false
        if(count<0) return false;
        //base case
        if(ind == str.length()){
            return (count==0);
        }
        if(str.charAt(ind) == '('){
            return help(str, ind+1, count+1);
        } else if (str.charAt(ind) == ')') {
            return help(str, ind+1, count-1);
        }
        return help(str, ind+1,count+1)|| help(str,ind+1, count-1) || help(str, ind+1, count);
    }//Time and space complexity:: - 3^N and space is O(N)




    public static void main(String[] args) {
        String str = "(())";
        System.out.println(isValidSpecialCase(str));
    }
}
