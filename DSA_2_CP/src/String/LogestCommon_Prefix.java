package String;

import java.util.Arrays;

public class LogestCommon_Prefix {
    public static void main(String[] args) {
        String[] str ={"flower","flow","flIght"};
        System.out.println(longestcommonPrefix(str));

    }

    public static String longestcommonPrefix(String[] strs) {
        String  pref = strs[0];
        int prelen = pref.length();
        for(int i = 1 ; i< strs.length; i++){
            String s = strs[i] ;
            while(prelen > s.length() || !pref.equals(s.substring(0, prelen))){
                prelen--;
                if(prelen == 0) {

                    return "";
                }
                pref = pref.substring(0,prelen);


            }

        }
        return pref;


    }

}
