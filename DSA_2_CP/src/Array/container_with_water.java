package Array;
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//
// Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
// In this case, the max area of water (blue section) the container can contain is 49.
public class container_with_water {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxarea(arr));

    }
    public static int maxarea(int[] height){
        int n = height.length;
        int maxarea = 0;
        int start = 0, end = n-1;
        while(start < end){
            int width = end - start;
            int minheight = Math.min(height[start], height[end]);
            int area = width*minheight;
            maxarea = Math.max(maxarea, area);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }

        }
        return maxarea;


    }
}
