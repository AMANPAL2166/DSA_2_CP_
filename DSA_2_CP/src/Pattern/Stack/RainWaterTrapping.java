package Pattern.Stack;

public class RainWaterTrapping {
    public static int[] trap(int[] height) {
        //find max right and left
        int[] maxRight = new int[height.length];
        int[] maxLeft = new int[height.length];
       for(int i = 1;i<maxRight.length;i++){
           int max = height[0];
           if(height[i]>max){
               maxRight[i] = max;
               maxRight[i] = height[i];
           }

       }
       return  maxRight;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,2};
        int[] ans = trap(arr);
        for(int i  = 0;i<ans.length;i++){
            System.out.print( ans[i]+"");
        }
    }
}
