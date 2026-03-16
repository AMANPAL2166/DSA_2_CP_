package Pattern.Stack;

public class RainWaterTrapping {
    public static int  trap(int[] height) {
        //find max right and left
        int n = height.length;
        int[] maxRight = new int[height.length];
        int[] maxLeft = new int[height.length];
        int[] waterLabel = new int[height.length];
        maxRight[0] = height[0];
        maxLeft[n-1] = height[n-1];
       for(int i = 1;i<maxRight.length;i++){
           maxRight[i] = Math.max(maxRight[i-1],height[i]);

       }
        for(int i = n-2;i>=0;i--){
            maxLeft[i] = Math.max(maxLeft[i+1], height[i]);
        }
        //
        for(int i = 0;i<height.length;i++){
            waterLabel[i] = Math.min(maxRight[i], maxLeft[i]) - height[i];
        }
        int sum = 0;
        for(int  i = 0;i<height.length;i++){
            sum += waterLabel[i];
        }

       return  sum;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] ans = trap(arr);
//        for(int i  = 0;i<ans.length;i++){
//            System.out.print( ans[i]+" ");
//        }
        System.out.println(trap(arr));
    }
}
