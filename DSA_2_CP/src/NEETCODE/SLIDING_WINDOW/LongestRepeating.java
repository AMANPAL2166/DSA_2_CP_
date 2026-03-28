package NEETCODE.SLIDING_WINDOW;

public class LongestRepeating {
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        if(n==1){
            return 1;
        }
        int max = 0;
        char[] ch = s.toCharArray();
        for(int i  = 0;i<n;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(ch[i] == ch[j]){
                    count++;
                } else if (ch[i] != ch[j] && k>0) {
                    k--;
                    count++;
                }else{
                    break;
                }

            }
            max = Math.max(count,max);
            if(max> n/2){
                return count;
            }
        }
        return max;


    }

    public static int characterReplacement_(String s, int k ) {
        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxLength = 0;
        for(int right = 0;right<s.length();right++){
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(right)-'A']);
            //invalid window
            if((right-left+1) - maxfreq>k){
                freq[s.charAt(right) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String st = "ABCD";
        System.out.println(characterReplacement_(st,2));
    }
}
