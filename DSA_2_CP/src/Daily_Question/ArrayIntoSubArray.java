package Daily_Question;
//3010. Divide an Array Into Subarrays With Minimum Cost I
//Easy
//Topics
//premium lock icon
//Companies
//You are given an array of integers nums of length n.
//
//The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.
//
//You need to divide nums into 3 disjoint contiguous subarrays.
//
//Return the minimum possible sum of the cost of these subarrays.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,12]
//Output: 6
//Explanation: The best possible way to form 3 subarrays is: [1], [2], and [3,12] at a total cost of 1 + 2 + 3 = 6.
//The other possible ways to form 3 subarrays are:
//- [1], [2,3], and [12] at a total cost of 1 + 2 + 12 = 15.
//- [1,2], [3], and [12] at a total cost of 1 + 3 + 12 = 16.

public class ArrayIntoSubArray {
    public static int minimumCost(int[] nums) {
        //first index of nums is our first subarray, then find two small number
        //base case
        if(nums.length == 3){
            return nums[0]+ nums[1] + nums[2];
        }
        int  fitst= nums[0];
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int i = 1; i<nums.length;i++){
            if(nums[i] < second){
                third = second;
                second = nums[i];
            } else if (nums[i] <third) {
                third = nums[i];

            }
        }
        System.out.println("first " + fitst);
        System.out.println("Second " + second);
        System.out.println("third " + third);
        int sum = fitst + second+ third;
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {10,3,1,1};
         int function = minimumCost(arr);
        System.out.println(function);
    }
}
