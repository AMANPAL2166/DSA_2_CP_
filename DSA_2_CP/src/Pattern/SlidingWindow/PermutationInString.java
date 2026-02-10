package Pattern.SlidingWindow;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        for(int i = 0; i<str2.length; i++){
             int j = i+1;
             while(j<str1.length){

             }
        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));


    }
}
