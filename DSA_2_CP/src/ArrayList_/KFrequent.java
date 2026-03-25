package ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int num: nums ){
            ans.put(num, ans.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: ans.keySet()){
            int freq = ans.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0 && index < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[index++] = num;
                    if(index == k) break;
                }
            }
        }




        return res;

    }
}
