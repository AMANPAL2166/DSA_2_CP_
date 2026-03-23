package String;

import java.util.HashMap;

public class KAnagram {
    public static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int n = s1.length();
        int m = s2.length();
        //edeg case
        if(n!=m ){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<m;i++){
            char ch = s2.charAt(i);
            if(map.getOrDefault(ch,0)>0){
                map.put(ch,map.get(ch)-1);
            }
        }
        int count = 0;
        for(char ch: map.keySet()){
            count+= map.get(ch);
        }

        if(count>k){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "fodr", s2 = "gork";
        int k = 2;
        System.out.println(areKAnagrams(s1,s2, k));

    }
}
