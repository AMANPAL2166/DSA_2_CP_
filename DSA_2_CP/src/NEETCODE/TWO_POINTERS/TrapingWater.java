package NEETCODE.TWO_POINTERS;

public class TrapingWater {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while(i<j){
            if(height[i] < height[j]){
                if(height[i] > leftMax){
                    leftMax = height[i];
                }else {
                    water += leftMax - height[i];
                }
                i++;
            }else{
                if(height[j] > rightMax){
                    rightMax = height[j];
                }else{
                    water +=rightMax-height[j];
                }
                j--;
            }

        }
        return water;

    }

    public static void main(String[] args) {

    }
}
