package Daily_Doze;

public class June26 {
    public static String reverseWord(String str){
        //make a string array
        String[] word = str.trim().split("\\s");
        //Create a stringBuilder to store reverse order
        StringBuilder ans = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            ans.append(word[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
        //Time: o(n)
        //Space: o(n)
    }

    public static String reverse(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        char[] arr = str.toCharArray();
        //Step 1: Reverse extra spaces
        reverse(arr,0, arr.length-1);
        //Step 2: Reverse each word
        int start = 0;
        for(int end = 0;end<=arr.length;end++){
            if(end == arr.length || arr[end] == ' ') {
                reverse(arr,start, end-1);
                start = end+1;
            }
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int i, int i1) {
        while(i<i1){
            char temp = arr[i];
            arr[i]= arr[i1];
            arr[i1] = temp;

            i++;//move pointer
            i1--;//
        }
    }
    private static boolean checkPalindrome(String str){
        char[] ch = str.toCharArray();
        int i = 0, j= ch.length-1;
        while(i<=j){
            if(ch[i] != ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private static String longestPalindrome(String st){
        if(st == null || st.length()<1) return " ";
        int start = 0, end = 0;
        for(int i = 0;i<st.length();i++){
            //Case 1: Odd length palindrome
            int len1 = expandAroundCenter(st,i,i);
            //Case 2: Even length palindrome
            int len2 = expandAroundCenter(st, i, i+1);
            //take the maximum of both
            int len = Math.max(len1,len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return st.substring(start, end + 1);
    }

    private static int expandAroundCenter(String st, int i, int i1) {
        //Expand outwards as long as characters match and we are within bounds
        while (i >= 0 && i1 < st.length() && st.charAt(i) == st.charAt(i1)){

           i1++;
           i--;
        }
        return i1-i-1;
    }

    public static void main(String[] args) {
        String st = "ababa";
        boolean checkPalimdrom = checkPalindrome(st);
        System.out.println(checkPalimdrom);

//        System.out.println(st.charAt(1));
    }
}
