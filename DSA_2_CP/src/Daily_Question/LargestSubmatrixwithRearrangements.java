package Daily_Question;

import java.util.Arrays;

public class LargestSubmatrixwithRearrangements {
    public static int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n=matrix[0].length;
        int maxArea = 0;
        //Step 1: Calculate height of every call
        for(int i = 1;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        //Step 2: Har row ke liye heights ko sort karke area nikalo
        for(int i = 0;i<m;i++){
            //// Hum current row ki heights ko copy karke sort karenge
            int[] currentRow = matrix[i].clone();
            Arrays.sort(currentRow);
            // Sort hone ke baad rectangle ki width hamesha (n - j) hogi
            for (int j = 0; j < n; j++) {
                int height = currentRow[j];
                int width = n - j;
                maxArea = Math.max(maxArea, height * width);
            }

        }
        return maxArea;

    }
    public static void main(String[] args) {


    }

}
