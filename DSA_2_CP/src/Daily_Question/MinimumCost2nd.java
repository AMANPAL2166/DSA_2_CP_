package Daily_Question;

import java.util.PriorityQueue;
import java.util.TreeSet;

//Divide an Array Into Subarrays With Minimum Cost II
//Hard
//Topics
//premium lock icon
//Companies
//Hint
//You are given a 0-indexed array of integers nums of length n, and two positive integers k and dist.
//
//The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.
//
//You need to divide nums into k disjoint contiguous subarrays, such that the difference between the starting index of the second subarray and the starting index of the kth subarray should be less than or equal to dist. In other words, if you divide nums into the subarrays nums[0..(i1 - 1)], nums[i1..(i2 - 1)], ..., nums[ik-1..(n - 1)], then ik-1 - i1 <= dist.
//
//Return the minimum possible sum of the cost of these subarrays.
//
//
//
//Example 1:
//
//Input: nums = [1,3,2,6,4,2], k = 3, dist = 3
//Output: 5
//Explanation: The best possible way to divide nums into 3 subarrays is: [1,3], [2,6,4], and [2]. This choice is valid because ik-1 - i1 is 5 - 2 = 3 which is equal to dist. The total cost is nums[0] + nums[2] + nums[5] which is 1 + 2 + 2 = 5.
//It can be shown that there is no possible way to divide nums into 3 subarrays at a cost lower than 5.
public class MinimumCost2nd {
    public static long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        long base = nums[0];
        long ans = Long.MAX_VALUE;

        int need = k - 1;

        // store {value, index}
        TreeSet<int[]> small = new TreeSet<>(
                (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );
        TreeSet<int[]> large = new TreeSet<>(
                (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        long smallSum = 0;

        int l = 1;

        for (int r = 1; r < n; r++) {

            int[] cur = new int[]{nums[r], r};
            small.add(cur);
            smallSum += nums[r];

            // keep only k-1 smallest in small
            if (small.size() > need) {
                int[] last = small.last();
                small.remove(last);
                smallSum -= last[0];
                large.add(last);
            }

            // fix window: ensure index spread ≤ dist
            while (!small.isEmpty() &&
                    r - l > dist) {

                int[] toRemove = new int[]{nums[l], l};
                l++;

                if (small.remove(toRemove)) {
                    smallSum -= toRemove[0];
                } else {
                    large.remove(toRemove);
                }

                // rebalance
                if (small.size() < need && !large.isEmpty()) {
                    int[] first = large.first();
                    large.remove(first);
                    small.add(first);
                    smallSum += first[0];
                }
            }

            // update answer when we have k-1 elements
            if (small.size() == need) {
                ans = Math.min(ans, base + smallSum);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] ={10,1,2,2,2,1};
        int k = 4;
        int dist = 3;
        System.out.println(minimumCost(arr,k,dist));
    }

}
