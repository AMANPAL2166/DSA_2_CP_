package Pattern.Stack;

import java.util.Stack;

public class MaxumumRectangle {
    public static int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int[] height = new int[cols];
        int maxArea = 0;
        for(int i = matrix.length;i++) {

            for(int j = 0;j<cols;j++){
                if(matrix[i][j] =='1'){
                    height[j] += 1;
                }else{
                    height[j] = 0;
                }
            }
            maxArea = Math.max(maxArea,largestRectangelArea(height));
        }
        return maxArea;



    }

    public static int largestRectangelArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i = 0;i< heights.length;i++){
            int h = (i== heights.length) ? 0:heights[i];
            while(!st.isEmpty() &&h<heights[st.peek()]){
                int height = heights[st.pop()];
                int width = st.isEmpty()? i: i-st.peek()-1;
                max = Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;

    }

}
