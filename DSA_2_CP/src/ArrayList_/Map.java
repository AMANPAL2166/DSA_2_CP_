package ArrayList_;

import java.util.HashMap;
import java.util.Set;
public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(33, "Aman");
        map.put(3, "Munna");
        map.put(24, "asharay");
        map.put(1, "Adarsh");
        System.out.println(map.get(33));
        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("Aman"));
        //how to use loop in hashmap
//        Set<Integer> keys = map.keySet();
//        for(int i: keys){
//            System.out.println(map.get(i));
//        }
        ///  or we've another method to call map.keyset
//        for(int i: map.keySet() ){
//            System.out.println(map.get(i));
//        }

        //how to print both keys
        ///  here we've map.entry
        Set<java.util.Map.Entry<Integer, String>> entries = map.entrySet();
        for(java.util.Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue());
        }

    }

}
