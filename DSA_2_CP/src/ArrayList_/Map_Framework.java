package ArrayList_;

import java.util.HashMap;
import java.util.Map;

public class Map_Framework {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("One", 1);
        System.out.println("All maps with their key: "+ mp);
    }
}
