package NEETCODE.BINARY_SEARCH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Key_Store {
    HashMap<String, List<Pair>> map;
    class Pair{
        int time;
        String value;
        Pair(int t, String v){
            time = t;
            value = v;
        }
    }
    public void timeMap(){
        map = new HashMap<>();

    }
    public void set (String key, String value, int timeStamp){
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(timeStamp,value));
    }
    public String get(String key, int timeStamp){
        if(!map.containsKey(key)) return "";
        List<Pair> list = map.get(key);
        int left = 0,right = list.size()-1;
        String res = "";
        while(left<=right){
            int mid = (left+right)/2;
            if(list.get(mid).time<=timeStamp){
                res = list.get(mid).value;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
}
