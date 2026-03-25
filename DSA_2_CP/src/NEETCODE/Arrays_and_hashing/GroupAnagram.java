package NEETCODE.Arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //using hashmap without frequency
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

    }
    public static List<List<String>> groupAnagrams_2(String[] strs) {
        //using hashmap without frequency
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            //count freq
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            //build key
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                keyBuilder.append('#');
                keyBuilder.append(freq[i]);
            }
            String key = keyBuilder.toString();
            //map logic
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }




        public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Hashmap method:- "+groupAnagrams(str));
        System.out.println("frequency method: "+ groupAnagrams_2(str));
    }
}
