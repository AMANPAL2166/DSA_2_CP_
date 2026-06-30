package Daily_Doze;

public class June30 {
    public static int strStr(String haystack, String needle) {
        //use sliding window
        int i = 0;
        int j = 0;
        while(haystack.length() > needle.length()){
            if(haystack.charAt(i) != needle.charAt(j)){
                i++;
                j=0;
            }else{
                i++;j++;
            }
            if(j == needle.length()-1) return i-j;
        }
        return -1;
    }
    private static int Strstr(String haysatck , String needle){
        //get length of both string
        int hLen = 0, nLen = 0;
        //edge case: if nLen > hLen means we'll never find substing of needle in haystack
        if(nLen> hLen) return  -1;
        //run outerloop tilll the length of haystack-needle length
        for(int i = 0;i<hLen-nLen;i++){
            int j = 0;
            //run inner loop  till the length of neddle if we found same character
            while(haysatck.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            //check if we iterate whole needle length it means we found our substring. we should return it now
            if(j== nLen) return i;

        }
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(Strstr(haystack,needle));
    }
}
