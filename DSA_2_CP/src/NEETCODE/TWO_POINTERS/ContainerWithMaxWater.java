package NEETCODE.TWO_POINTERS;

public class ContainerWithMaxWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j){
            int minHeight = Math.min(height[i], height[j]);
            int length = Math.abs(i-j);
            int contains = minHeight*length;
            if(contains>ans){
                ans = contains;
            }
           if(height[i] >height[j]){
               j--;
           }else{
               i++;
           }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));

    }
}
