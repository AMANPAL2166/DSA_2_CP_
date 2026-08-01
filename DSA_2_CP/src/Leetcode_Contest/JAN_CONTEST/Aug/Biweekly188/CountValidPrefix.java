package Leetcode_Contest.JAN_CONTEST.Aug.Biweekly188;

public class CountValidPrefix {
    public static int countValidPrefixes(String s) {
        int count0 = 0;
        int count1 = 0;
        int countPre = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                count0++;
            }else {
                count1++;
            }
            if(Math.abs(count0 - count1 )<=1){
                countPre++;
            }
        }
        return countPre;

    }

    public static void main(String[] args) {
        System.out.println(countValidPrefixes("01001"));
    }
}
