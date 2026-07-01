package Daily_Doze;

public class July1 {
    public static boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if( n!= m)return false;
        for(int i= 0;i<n;i++){
            int j = 0;
            while(j<m  ){
                if(s.charAt(i) == t.charAt(j)){
                    break;
                }
                if(j== m-1 && s.charAt(i) != t.charAt(i)){
                    return false;
                }
                j++;
            }
        }
        return true;
        //I'm just comparing character not
    }
    public boolean isAnagram_(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!= m) return false;
        int[] freq = new int[26];
        for(int i = 0;i<n;i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int j = 0;j<m;j++){
            freq[t.charAt(j)- 'a']--;
        }
        for(int i = 0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;

    }
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m = needle.length();
        for(int i = 0;i<n-m;i++){
            int j = 0;
            while(j<m && haystack.charAt(i+j) == needle.charAt(j));{
                j++;
            }
            if(j==m-1){
                return i;
            }

        }
        return -1;

    }
    public static int minInsertions(String s) {
        int count = 0;
        int i = 0;
        int j= s.length()-1;
        while (i<j){
            if(s.charAt(i) != s.charAt(j)){
                count++;
                i++;
            }else{
                i++;
                j--;
            }
        }
        return count;

    }
    //Kth symbool
    public int kthGrammar(int n, int k) {
        //Base case
        if(n==0 && k == 1) return 0;
        //Hypothesis
        ///  calculate mid point
        int mid = (int)Math.pow(2,n-2);
        //if ke int the first half
        if(k<= mid){
            return kthGrammar(n-1, k);
        }
       // else
        else{
            //mapping result
            int mappingResult = kthGrammar(n-1, k-mid);
            return mappingResult == 0?1:0;//flip 0 to 1 or 1 to 0

        }
        //Induction


    }

    public static void main(String[] args) {
//        String s = "rat", t = "car";
//        System.out.println(isAnagram(s,t));
        String s = "leetcode";
        System.out.println(minInsertions(s));
    }
}
