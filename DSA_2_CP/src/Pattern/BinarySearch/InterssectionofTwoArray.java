package Pattern.BinarySearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InterssectionofTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another HashSet to store the intersection elements to handle duplicates in both arrays
        Set<Integer> intersectSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }

        // Convert the final Set<Integer> to a primitive int[] array
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }

        return result;

    }
}
